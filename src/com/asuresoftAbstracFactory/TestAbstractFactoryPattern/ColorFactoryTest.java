package com.asuresoftAbstracFactory.TestAbstractFactoryPattern;

import com.asuresoftAbstracFactory.*;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
public class ColorFactoryTest {
    private ColorFactory colorFactory;
    private Red red;
    private Green green;
    private Blue blue;
    @Before
    public void setUp(){
        colorFactory=mock(ColorFactory.class);
        red=mock(Red.class);
        green=mock(Green.class);
        blue=mock(Blue.class);

    }
    @Test
    public void getColor_Red() {
        when(colorFactory.getColor("RED")).thenReturn(red);
        assertNotNull(colorFactory.getColor("RED"));
    }
    @Test
    public void getColor_Green() {
        when(colorFactory.getColor("GREEN")).thenReturn(green);
        assertNotNull(colorFactory.getColor("GREEN"));
    }
    @Test
    public void getColor_Blue() {
        when(colorFactory.getColor("BLUE")).thenReturn(blue);
        assertNotNull(colorFactory.getColor("BLUE"));
    }
    @Test
    public void getColor_Null() {
        when(colorFactory.getColor("")).thenReturn(null);
        assertNull(colorFactory.getColor(""));
    }


    @Test
    public void getShape() {
        when(colorFactory.getShape(anyString())).thenReturn(null);
        assertNull(colorFactory.getShape("RED"));

    }
}
