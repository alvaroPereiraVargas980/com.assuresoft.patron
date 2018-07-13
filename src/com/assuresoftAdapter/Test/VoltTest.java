package com.assuresoftAdapter.Test;

import com.assuresoftAdapter.Volt;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class VoltTest {
    private Volt volt;

    @Before
    public void setUpMock(){
        volt = mock(Volt.class);
    }

    @Test
    public void getVolts() {
       assertNotNull(volt.getVolts());
    }

    @Test
    public void setVolts() {
        doNothing().when(volt).setVolts(120);

    }
}
