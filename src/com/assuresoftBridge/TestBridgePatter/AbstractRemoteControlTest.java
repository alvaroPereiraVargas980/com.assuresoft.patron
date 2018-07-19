package com.assuresoftBridge.TestBridgePatter;

import com.assuresoftBridge.*;
import com.assuresoftBridge.AbstractRemoteControl;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class AbstractRemoteControlTest {
    private AbstractRemoteControl abstractRemoteControl;
    private ITV itv;
    @Before
    public void setUpMockup(){

        abstractRemoteControl = mock(AbstractRemoteControl.class);
        itv=mock(ITV.class);
    }

    @Test
    public void turOn() throws Exception{
       doNothing().when(abstractRemoteControl).turOn();
       abstractRemoteControl.turOn();
       verify(abstractRemoteControl,times(1)).turOn();

    }

    @Test
    public void turnOff() throws Exception {
        doNothing().when(abstractRemoteControl).turnOff();
        abstractRemoteControl.turnOff();
        verify(abstractRemoteControl,times(1)).turnOff();
    }

    @Test
    public void setChannel() throws Exception{
        doNothing().when(abstractRemoteControl).setChannel(isA(Integer.class));
        itv.switchChannel(isA(Integer.class));
        verify(itv,atLeastOnce()).switchChannel(isA(Integer.class));
    }
}
