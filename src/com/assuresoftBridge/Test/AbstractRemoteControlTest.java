package com.assuresoftBridge.Test;


import com.assuresoftBridge.AbstractRemoteControl;
import com.assuresoftBridge.ITV;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.mockito.Mockito.*;

public class AbstractRemoteControlTest {
    @Mock
    ITV itv;

    @InjectMocks
    AbstractRemoteControl abstractRemoteControl;

    @Before
    public void setUpMockup(){
        abstractRemoteControl = mock(AbstractRemoteControl.class);
    }

    @Test
    public void turOn() {
       doNothing().when(abstractRemoteControl).turOn();

    }

    @Test
    public void turnOff() {
        doNothing().when(abstractRemoteControl).turnOff();
    }

    @Test
    public void setChannel() {
        doNothing().when(abstractRemoteControl).setChannel(12);
    }
}
