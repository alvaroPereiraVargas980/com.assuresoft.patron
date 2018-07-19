package com.asuresoftAbstracFactory.TestAbstractFactoryPattern;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.*;
import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class BlueTest {
    private ByteArrayOutputStream print = new ByteArrayOutputStream();
    private  PrintStream originalprint = System.out;
    @Before
    public void setUpMock() {
        System.setOut(new PrintStream(print));
    }
    @After
    public void restoreStreams() {
        System.setOut(originalprint);
    }

    @Test
    public void fill() {
        System.out.print("Inside blue");
        assertEquals("Inside blue",print.toString());

    }
}
