package com.assuresoftDecorator.TestDecoratorPatter;


import com.assuresoftDecorator.Rectangle;
import com.assuresoftDecorator.Shape;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;


public class RectangleTest {
    private ByteArrayOutputStream print = new ByteArrayOutputStream();
    private PrintStream originalPrint = System.out;
    private Rectangle rectangle;
    @Before
    public void seUpMock(){
        System.setOut(new PrintStream(print));
        rectangle=mock(Rectangle.class);
    }
    @After
    public void restoreStreams() {
        System.setOut(originalPrint);
    }

    @Test
    public void draw() throws Exception{
        doNothing().when(rectangle).draw();
        System.out.print("Shape:Rectangle");
        assertEquals("Shape:Rectangle",print.toString());
    }
}
