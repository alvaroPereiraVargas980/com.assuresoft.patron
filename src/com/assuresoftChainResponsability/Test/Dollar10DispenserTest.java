package com.assuresoftChainResponsability.Test;
import com.assuresoftChainResponsability.Currency;
import com.assuresoftChainResponsability.DisperseChain;
import com.assuresoftChainResponsability.Dollar10Dispenser;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;

import static org.mockito.Matchers.isNotNull;
import static org.mockito.Matchers.isNull;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;



public class Dollar10DispenserTest {
    private Dollar10Dispenser dollar10Dispenser;

    @Mock
    DisperseChain chain;

    @Before
    public void setUpMock(){
        dollar10Dispenser=mock(Dollar10Dispenser.class);
    }
    @Test
    public void setNextChain() throws Exception{
        doNothing().when(dollar10Dispenser).setNextChain(chain);
    }

    @Test
    public void disperseTestIsNull() throws Exception{
       doNothing().when(dollar10Dispenser).disperse((Currency) isNull());
    }
    @Test
    public void disperseTestIsNotNull() throws Exception{
        doNothing().when(dollar10Dispenser).disperse((Currency) isNotNull());
    }

}
