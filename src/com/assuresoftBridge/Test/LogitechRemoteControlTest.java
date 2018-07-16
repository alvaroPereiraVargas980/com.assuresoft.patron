package com.assuresoftBridge.Test;


import com.assuresoftBridge.ITV;
import com.assuresoftBridge.LogitechRemoteControl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static javafx.beans.binding.Bindings.when;
import static org.junit.Assert.*;
import static org.mockito.Mockito.doNothing;


public class LogitechRemoteControlTest {
    LogitechRemoteControl logitechRemoteControl;
    @Test
    public void setChannerKeyboard() throws Exception {
        doNothing().when(logitechRemoteControl).setChannerKeyboard(12);

    }
}
