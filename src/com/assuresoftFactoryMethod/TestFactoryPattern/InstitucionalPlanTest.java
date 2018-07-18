package com.assuresoftFactoryMethod.TestFactoryPattern;


import com.assuresoftFactoryMethod.DomesticPlan;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;


public class InstitucionalPlanTest {

    private DomesticPlan domesticPlan;

    @Before
    public void setUpMock() {
        domesticPlan = mock(DomesticPlan.class);
    }

    @Test
    public void getRate() {
        doNothing().when(domesticPlan).getRate();
    }
}
