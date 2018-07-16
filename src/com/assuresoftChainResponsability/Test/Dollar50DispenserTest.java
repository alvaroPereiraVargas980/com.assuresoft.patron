package com.assuresoftChainResponsability.Test;


import com.assuresoftChainResponsability.Currency;
import com.assuresoftChainResponsability.DisperseChain;
import com.assuresoftChainResponsability.Dollar50Dispenser;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;

import static org.mockito.Matchers.isNotNull;
import static org.mockito.Matchers.isNull;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;


public class Dollar50DispenserTest {

    private Dollar50Dispenser dollar50Dispenser;

    @Mock
    DisperseChain chain;

    @Before
    public void setUpMock(){
        dollar50Dispenser=mock(Dollar50Dispenser.class);
    }
    @Test
    public void setNextChain() throws Exception{
        doNothing().when(dollar50Dispenser).setNextChain(chain);
    }

    @Test
    public void disperseTestIsNull() throws Exception{
        doNothing().when(dollar50Dispenser).disperse((Currency) isNull());
    }
    @Test
    public void disperseTestIsNotNull() throws Exception{
        doNothing().when(dollar50Dispenser).disperse((Currency) isNotNull());
    }
}
