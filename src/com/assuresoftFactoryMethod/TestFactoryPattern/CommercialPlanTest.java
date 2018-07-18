package com.assuresoftFactoryMethod.TestFactoryPattern;
import  com.assuresoftFactoryMethod.*;
import static org.mockito.Mockito.*;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CommercialPlanTest {
    private CommercialPlan commercialPlan;

    @Before
    public void setUpMock(){
        commercialPlan=mock(CommercialPlan.class);
    }
    @Test
    public void getRate() {
        doNothing().when(commercialPlan).getRate();

    }
}
