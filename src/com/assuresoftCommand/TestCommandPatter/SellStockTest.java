package com.assuresoftCommand.TestCommandPatter;
import com.assuresoftCommand.Stock;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;
import com.assuresoftCommand.*;

public class SellStockTest {
    private Stock abcStock;
    private SellStock sellStock;
    @Before
    public void setUpMsock() {
        abcStock = mock(Stock.class);
        sellStock=mock(SellStock.class);
    }
    @Test
    public void execute() throws Exception{
            doNothing().when(abcStock).sell();
            sellStock.execute();
            verify(sellStock,atLeastOnce()).execute();
        }
    }

