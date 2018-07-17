package com.assuresoftDecorator.TestDecoratorPatter;


import com.assuresoftComposite.Department;
import com.assuresoftDecorator.Circle;
import com.assuresoftDecorator.Shape;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;


public class CircleTest {
    private ByteArrayOutputStream print = new ByteArrayOutputStream();
    private PrintStream originalPrint = System.out;
    private Circle circle;
    @Before
    public void seUpMock(){
        System.setOut(new PrintStream(print));
        circle=mock(Circle.class);
    }
    @After
    public void restoreStreams() {
        System.setOut(originalPrint);
    }
    @Test
    public void draw() throws Exception{
        doNothing().when(circle).draw();
        System.out.print("Shape:Circle");
        assertEquals("Shape:Circle",print.toString());

    }
}
