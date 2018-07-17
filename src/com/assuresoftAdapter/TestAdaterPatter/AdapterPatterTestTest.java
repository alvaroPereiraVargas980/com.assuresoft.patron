package com.assuresoftAdapter.TestAdaterPatter;

import com.assuresoftAdapter.*;
import org.junit.Test;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;
import org.junit.Before;

public class AdapterPatterTestTest {
    private Volt volt;
    private SocketAdapter socketAdapter;

    @Before
    public void setuMock(){
        volt = mock(Volt.class);
        socketAdapter=mock(SocketAdapter.class);

    }

    @Test
    public void testObjetAdapter() {
        System.out.print("prueba de testing objectAdapter");
        when(volt.getVolts()).thenReturn(120).thenReturn(12).thenReturn(3);
       assertEquals(volt.getVolts(),120);
       assertEquals(volt.getVolts(),12);
       assertEquals(volt.getVolts(),3);
    }

    @Test
    public void testClassAdapter() {
        System.out.print("prueba de testing classAdapter");
        when(volt.getVolts()).thenReturn(120).thenReturn(12).thenReturn(3);
        assertEquals(volt.getVolts(),120);
        assertEquals(volt.getVolts(),12);
        assertEquals(volt.getVolts(),3);
    }
    @Test
    public void getVolt() {
        System.out.print("prueba de testing getVolt");
        when(socketAdapter.get120Volt()).thenReturn(new Volt(120));
        when(socketAdapter.get3Volt()).thenReturn(new Volt(3));
        when(socketAdapter.get12Volt()).thenReturn(new Volt(12));

       assertNotNull(socketAdapter.get120Volt());
       assertNotNull(socketAdapter.get12Volt());
       assertNotNull(socketAdapter.get3Volt());
    }
}
