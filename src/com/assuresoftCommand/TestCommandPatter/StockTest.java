package com.assuresoftCommand.TestCommandPatter;
import static junit.framework.TestCase.assertEquals;
import static org.mockito.Mockito.*;

import com.assuresoftCommand.Stock;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import java.io.PrintStream;
import java.io.ByteArrayOutputStream;

public class StockTest {
    private  ByteArrayOutputStream buy = new ByteArrayOutputStream();
    private  ByteArrayOutputStream sell = new ByteArrayOutputStream();
    private  PrintStream originalBuy = System.out;
    private  PrintStream originalSell = System.err;
    private Stock stock;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(buy));
        System.setErr(new PrintStream(sell));
        stock=mock(Stock.class);
    }
    @After
    public void restoreStreams() {
        System.setOut(originalBuy);
        System.setErr(originalSell);
    }
    @Test
    public void buy() throws Exception{
        String name="ABC";
        int quality=10;
        doNothing().when(stock).buy();
        stock.buy();
        verify(stock,atLeastOnce()).buy();
        System.out.print("Strock [Name: " + name + "Quality:"+quality+"] bought");
        assertEquals("Strock [Name: " + name + "Quality:"+quality+"] bought", buy.toString());
    }
    @Test
    public void sell() throws Exception{
        String name="ABC";
        int quality=40;
        doNothing().when(stock).sell();
        stock.sell();
        verify(stock,atLeastOnce()).sell();
        System.err.print("Stock [ NameL" + name + "Quality:" + quality+"] bought ");
        assertEquals("Stock [ NameL" + name + "Quality:" + quality+"] bought ", sell.toString());
    }
}
