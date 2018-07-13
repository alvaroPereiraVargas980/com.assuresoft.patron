package com.assuresoftAdapter.Test;


import com.assuresoftAdapter.SocketAdapter;
import com.assuresoftAdapter.SocketClassAdapterImpl;
import com.assuresoftAdapter.Volt;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class SocketClassAdapterImplTest {
    private SocketAdapter socketAdapter;
    @Before
    public void setuMock(){
        socketAdapter = mock(SocketAdapter.class);
    }


    @Test
    public void get120Volt() {
        SocketClassAdapterImpl socketClassAdapter=new SocketClassAdapterImpl();
        assertNotNull(socketClassAdapter.get120Volt());
    }

    @Test
    public void get12Volt() {
        Mockito.when(socketAdapter.get12Volt()).thenReturn(new Volt(120));
        assertNotNull(socketAdapter.get12Volt());
    }

    @Test
    public void get3Volt() {
        Mockito.when(socketAdapter.get3Volt()).thenReturn(new Volt(120));
        assertNotNull(socketAdapter.get3Volt());
    }
}
