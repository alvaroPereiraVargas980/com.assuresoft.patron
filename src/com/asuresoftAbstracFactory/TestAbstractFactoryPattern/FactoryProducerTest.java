package com.asuresoftAbstracFactory.TestAbstractFactoryPattern;
import com.asuresoftAbstracFactory.*;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class FactoryProducerTest {
    private FactoryProducer factoryProducer;
    private ShapeFactory shapeFactory;
    private ColorFactory colorFactory;
    @Before
    public void setUp(){
        factoryProducer=mock(FactoryProducer.class);
        shapeFactory=mock(ShapeFactory.class);
        colorFactory=mock(ColorFactory.class);
    }
    @Test
    public void getFactory_Shape() {
       when(factoryProducer.getFactory("SHAPE")).thenReturn(shapeFactory);
       assertNotNull(factoryProducer.getFactory("SHAPE"));
    }
    @Test
    public void getFactory_Color() {
        when(factoryProducer.getFactory("COLOR")).thenReturn(colorFactory);
        assertNotNull(factoryProducer.getFactory("COLOR"));
    }
    @Test
    public void getFactory_Null() {
        when(factoryProducer.getFactory(" ")).thenReturn(null);
        assertNull(factoryProducer.getFactory(""));
    }
}
