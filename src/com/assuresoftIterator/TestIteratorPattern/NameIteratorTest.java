package com.assuresoftIterator.TestIteratorPattern;

import com.assuresoftIterator.*;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import static org.junit.Assert.*;


public class NameIteratorTest {
    private NameIterator iterator;
    private String names[]={"Alvaro","Roberto","Carlos"};

    @Before
    public void setUpMock(){
        iterator=mock(NameIterator.class);
    }
    @Test
    public void hasNextTrue() {
       when(iterator.hasNext()).thenReturn(true);
       assertTrue(iterator.hasNext());
    }
    @Test
    public void hasNextFalse() {
        when(iterator.hasNext()).thenReturn(false);
        assertTrue(iterator.hasNext());
    }

    @Test
    public void nextObject() {
        when(iterator.next()).thenReturn(names[2]);
        assertEquals("Carlos",iterator.next());
        assertNotNull(iterator.next());
    }
    @Test
    public void nextNull() {
        when(iterator.next()).thenReturn(null);
        assertEquals(null,iterator.next());
        assertNull(iterator.next());
    }
}
