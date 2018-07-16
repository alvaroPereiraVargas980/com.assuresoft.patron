package com.assuresoftBridge.Test;


import com.assuresoftBridge.SamSungTv;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import static org.mockito.Mockito.doNothing;
import org.mockito.Mockito;

public class SamSungTvTest {
    SamSungTv samSungTv = Mockito.mock(SamSungTv.class);

    @Test
    public void on() throws Exception {

        doNothing().when(samSungTv).on();
    }
    @Test
    public void off() throws Exception{
        doNothing().when(samSungTv).off();
    }

    @Test
    public void switchChannel() throws Exception{
        doNothing().when(samSungTv).switchChannel(12);

    }

}
