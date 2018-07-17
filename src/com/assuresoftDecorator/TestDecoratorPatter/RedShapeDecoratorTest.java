package com.assuresoftDecorator.TestDecoratorPatter;


import com.assuresoftDecorator.Shape;
import com.assuresoftDecorator.ShapeDecorator;
import com.assuresoftDecorator.RedShapeDecorator;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
public class RedShapeDecoratorTest {
    private Shape shape;
    private RedShapeDecorator redShapeDecorator;
    private ByteArrayOutputStream print = new ByteArrayOutputStream();
    private PrintStream originalPrint = System.out;

    @Before
    public void setUpmock(){
        System.setOut(new PrintStream(print));
        shape=mock(ShapeDecorator.class);
        redShapeDecorator=mock(RedShapeDecorator.class);
    }

    @Test
    public void draw() {
        RedShapeDecorator spy= spy(new RedShapeDecorator(shape));
        doNothing().when((ShapeDecorator)spy).draw();
        spy.draw();
        verify(spy).draw();
    }

    @Test
    public void setRedBorder() {
        doNothing().when(redShapeDecorator).draw();
        System.out.print("Border Color: Red");
        assertEquals("Border Color: Red",print.toString());
    }
}
