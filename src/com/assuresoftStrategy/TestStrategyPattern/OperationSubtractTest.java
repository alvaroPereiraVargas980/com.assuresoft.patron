package com.assuresoftStrategy.TestStrategyPattern;

import com.assuresoftStrategy.*;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.Assert.*;


public class OperationSubtractTest {
    private OperationSubtract operationSubtract;

    @Before
    public void setUp(){
        operationSubtract=mock(OperationSubtract.class);
    }
    @Test
    public void doOperation() {
        when(operationSubtract.doOperation(10,5)).thenReturn(5);
        assertEquals(5,operationSubtract.doOperation(10,5));
    }
}
