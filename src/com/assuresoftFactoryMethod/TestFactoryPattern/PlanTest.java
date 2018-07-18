package com.assuresoftFactoryMethod.TestFactoryPattern;


import com.assuresoftDecorator.RedShapeDecorator;
import com.assuresoftDecorator.ShapeDecorator;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static java.lang.Integer.parseInt;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
public class PlanTest {
    private double rate=7.5;
    private ByteArrayOutputStream print = new ByteArrayOutputStream();
    private PrintStream originalPrint = System.out;
    @Before
    public void setUpmock(){
        System.setOut(new PrintStream(print));

    }


    @Test
    public void getRate() {
// there is no a specific way to determinade this method.
    }

    @Test
    public void calculateBill() {
        double  i =4;
        double resu= (int) (i*rate);
        String j= String.valueOf(resu);
        System.out.print(i*rate);
        assertEquals(j,print.toString());
    }
}
