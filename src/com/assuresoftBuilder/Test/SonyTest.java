package com.assuresoftBuilder.Test;


import com.assuresoftBuilder.Sony;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.when;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;


public class SonyTest {
    private Sony sony;

    @Before
    public void setUpMock(){
        sony=mock(Sony.class);
    }

    @Test
    public void price() {
        when(sony.price()).thenReturn(10);
        assertEquals(10,sony.price());
    }

    @Test
    public void pack() {
        when(sony.pack()).thenReturn("Sony Cd");
        assertEquals("Sony Cd",sony.pack());
    }
}
