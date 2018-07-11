package com.assuresoftAdapter.UnitTest;


import com.assuresoftAdapter.SocketAdapter;
import com.assuresoftAdapter.SocketClassAdapterImpl;
import com.assuresoftAdapter.Volt;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;


public class AdapterPatterTestTest {

    @Test
    public void testObjetAdapter() {
        SocketAdapter socketAdapter =new SocketClassAdapterImpl();
        Volt v3 = getVolt(socketAdapter,3);
        Volt v12= getVolt(socketAdapter,12);
        Volt v120= getVolt(socketAdapter,120);

        assertEquals(120,v120.getVolts());
        assertEquals(3,v3.getVolts());
        assertEquals(12,v12.getVolts());
    }


    @Test
    public void testClassAdapter() {
        SocketAdapter socketAdapter =new SocketClassAdapterImpl();
        Volt v3 = getVolt(socketAdapter,3);
        Volt v12= getVolt(socketAdapter,12);
        Volt v120= getVolt(socketAdapter,120);

        assertEquals(120,v120.getVolts());
        assertEquals(3,v3.getVolts());
        assertEquals(12,v12.getVolts());

    }


    public static Volt getVolt(SocketAdapter socketAdapter, int i){

        switch (i){
            case 3:return socketAdapter.get3Volt();
            case 12:return socketAdapter.get12Volt();
            case 120:return socketAdapter.get120Volt();
            default: return socketAdapter.get120Volt();
        }
    }
}
