package com.assuresoftFactoryMethod.TestFactoryPattern;


import com.assuresoftFactoryMethod.CommercialPlan;
import com.assuresoftFactoryMethod.DomesticPlan;
import com.assuresoftFactoryMethod.GetPlanFactory;
import com.assuresoftFactoryMethod.InstitucionalPlan;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class GetPlanFactoryTest {
    private GetPlanFactory getPlanFactory;
    private DomesticPlan domesticPlan;
    private CommercialPlan commercialPlan;
    private InstitucionalPlan institucionalPlan;

    @Before
    public void setUpMock(){
        getPlanFactory=mock(GetPlanFactory.class);
        domesticPlan=mock(DomesticPlan.class);
        commercialPlan =mock(CommercialPlan.class);
        institucionalPlan=mock(InstitucionalPlan.class);
    }


    @Test
    public void getPlanDomestic() {
        when(getPlanFactory.getPlan("DOMESTICPLAN")).thenReturn(domesticPlan);
       assertNotNull(getPlanFactory.getPlan("DOMESTICPLAN"));

    }
    @Test
    public void getPlanComercial() {
        when(getPlanFactory.getPlan("COMMERCIALPLAN")).thenReturn(commercialPlan);
        assertNotNull(getPlanFactory.getPlan("COMMERCIALPLAN"));
    }
    @Test
    public void getPlanInstitucional() {
        when(getPlanFactory.getPlan("INSTITUCIONALPLAN")).thenReturn(institucionalPlan);
        assertNotNull(getPlanFactory.getPlan("INSTITUCIONALPLAN"));
    }
    }


