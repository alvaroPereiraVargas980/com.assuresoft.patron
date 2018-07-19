package com.asuresoftAbstracFactory.TestAbstractFactoryPattern;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;


public class CircleTest {
    private ByteArrayOutputStream print = new ByteArrayOutputStream();
    private PrintStream originalprint = System.out;
    @Before
    public void setUpMock() {
        System.setOut(new PrintStream(print));
    }
    @After
    public void restoreStreams() {
        System.setOut(originalprint);
    }
    @Test
    public void draw() {
        System.out.print("Inside this circle::draw() method(). ");
        assertEquals("Inside this circle::draw() method(). ",print.toString());
    }
}
