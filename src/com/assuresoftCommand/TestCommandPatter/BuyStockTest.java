package com.assuresoftCommand.TestCommandPatter;
import static org.mockito.Mockito.*;

import com.assuresoftCommand.BuyStock;
import com.assuresoftCommand.Stock;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;

public class BuyStockTest {

    private Stock abcStock;
    private BuyStock buyStock;

    @Before
    public void setUpMock(){
        abcStock = mock(Stock.class);
        buyStock=mock(BuyStock.class);
    }
    @Test
    public void execute()throws Exception {
        doNothing().when(abcStock).buy();
        buyStock.execute();
        verify(buyStock,atLeastOnce()).execute();
    }
}
