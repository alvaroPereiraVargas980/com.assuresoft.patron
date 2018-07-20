package com.assuresoftBridge.UnitTest;

import com.assuresoftBridge.ITV;
import com.assuresoftBridge.LogitechRemoteControl;

import com.assuresoftBridge.SamSungTv;
import com.assuresoftBridge.SonyTV;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;


public class LogitechRemoteControlTest {


    @Test
    public void setChannerKeyboard() {
        ITV tv=new SonyTV();
        LogitechRemoteControl lrc=new LogitechRemoteControl(tv);
        lrc.setChannerKeyboard(100);

        ITV tv1= new SamSungTv();
        LogitechRemoteControl lrc1 =new LogitechRemoteControl(tv1);
        lrc1.setChannerKeyboard(200);
    }
}
