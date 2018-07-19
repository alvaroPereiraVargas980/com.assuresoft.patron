package com.assuresoftStrategy.TestStrategyPattern;


import org.junit.Before;
import org.junit.Test;
import com.assuresoftStrategy.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class OperatioMultiplyTest {
   private OperatioMultiply operatioMultiply;

   @Before
   public void setUp(){
       operatioMultiply=mock(OperatioMultiply.class);
   }

    @Test
    public void doOperation() {
       when(operatioMultiply.doOperation(5,5)).thenReturn(25);
       assertEquals(25,operatioMultiply.doOperation(5,5));
    }
}
