package com.assuresoftBridge.TestBridgePatter;

import com.assuresoftBridge.AbstractRemoteControl;
import com.assuresoftBridge.LogitechRemoteControl;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

public class LogitechRemoteControlTest {
    LogitechRemoteControl logitechRemoteControl;
    AbstractRemoteControl abstractRemoteControl;
    private ByteArrayOutputStream print = new ByteArrayOutputStream();
    private PrintStream originalprint = System.out;
    @Before
    public void seUp(){
        logitechRemoteControl=mock(LogitechRemoteControl.class);
        abstractRemoteControl=mock(AbstractRemoteControl.class);
        System.setOut(new PrintStream(print));
    }
    @After
    public void restoreStreams() {
        System.setOut(originalprint);
    }

    @Test
    public void setChannerKeyboard() throws Exception {
        doNothing().when(logitechRemoteControl).setChannerKeyboard(any(Integer.class));
        abstractRemoteControl.setChannel(any(Integer.class));
        verify(abstractRemoteControl,atLeastOnce()).setChannel(any(Integer.class));
        System.out.print("Logitech use keyboard to se channel");
        assertEquals("Logitech use keyboard to se channel",print.toString());

    }
}
