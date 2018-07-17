package com.assuresoftCommand.TestCommandPatter;
import com.assuresoftCommand.Stock;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;


public class SellStockTest {
    private Stock abcStock;

    @Before
    public void setUpMsock()

    {
        abcStock = mock(Stock.class);
    }
    @Test
    public void execute() throws Exception{

            doNothing().when(abcStock).sell();
        }
    }

