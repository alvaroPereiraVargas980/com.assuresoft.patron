package com.assuresoftChainResponsability.Test;

import com.assuresoftChainResponsability.Currency;
import com.assuresoftChainResponsability.DisperseChain;
import com.assuresoftChainResponsability.Dollar20Dispenser;
import org.junit.Before;
import org.mockito.Mock;
import static org.mockito.Matchers.isNotNull;
import static org.mockito.Matchers.isNull;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import org.junit.Test;

public class Dollar20DispenserTest {
    private Dollar20Dispenser dollar20Dispenser;

    @Mock
    DisperseChain chain;

    @Before
    public void setUpMock(){
        dollar20Dispenser=mock(Dollar20Dispenser.class);
    }
    @Test
    public void setNextChain() throws Exception{
        doNothing().when(dollar20Dispenser).setNextChain(chain);
    }

    @Test
    public void disperseTestIsNull() throws Exception{
        doNothing().when(dollar20Dispenser).disperse((Currency) isNull());
    }
    @Test
    public void disperseTestIsNotNull() throws Exception{
        doNothing().when(dollar20Dispenser).disperse((Currency) isNotNull());
    }
}
