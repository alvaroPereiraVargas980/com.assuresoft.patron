package com.asuresoftAbstracFactory.TestAbstractFactoryPattern;

import com.asuresoftAbstracFactory.*;
import com.asuresoftAbstracFactory.Blue;
import com.asuresoftAbstracFactory.ColorFactory;
import com.asuresoftAbstracFactory.Green;
import com.asuresoftAbstracFactory.Red;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class ShapeFactoryTest {
    private ShapeFactory shapeFactory;
    private Circle circle;
    private Rectangle rectangle;
    private Square square;
    @Before
    public void setUp(){
        shapeFactory=mock(ShapeFactory.class);
        circle=mock(Circle.class);
        rectangle=mock(Rectangle.class);
        square=mock(Square.class);

    }
    @Test
    public void getColor_Red() {
        when(shapeFactory.getShape("CIRCLE")).thenReturn(circle);
        assertNotNull(shapeFactory.getShape("CIRCLE"));
    }
    @Test
    public void getColor_Green() {
        when(shapeFactory.getShape("RECTANGLE")).thenReturn(rectangle);
        assertNotNull(shapeFactory.getShape("RECTANGLE"));
    }
    @Test
    public void getColor_Blue() {
        when(shapeFactory.getShape("SQUARE")).thenReturn(square);
        assertNotNull(shapeFactory.getShape("SQUARE"));
    }
    @Test
    public void getColor_Null() {
        when(shapeFactory.getShape("")).thenReturn(null);
        assertNull(shapeFactory.getShape(""));
    }


    @Test
    public void getColor() {
        when(shapeFactory.getShape(anyString())).thenReturn(null);
        assertNull(shapeFactory.getShape("CIRCLE"));

    }
}
