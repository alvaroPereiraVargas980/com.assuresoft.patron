package com.assuresoftStrategy.TestStrategyPattern;

import org.junit.Before;
import org.junit.Test;
import com.assuresoftStrategy.*;
import static org.junit.Assert.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class OperationAddTest {
    private OperationAdd operationAdd;

    @Before
    public void setUp(){
        operationAdd=mock(OperationAdd.class);
    }
    @Test
    public void doOperation() {
        when(operationAdd.doOperation(10,5)).thenReturn(15);
        assertEquals(15,operationAdd.doOperation(10,5));

    }
}
