package com.assuresoftBridge.Test;
import com.assuresoftBridge.SonyTV;
import org.junit.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.doNothing;


public class SonyTVTest {
   SonyTV sonyTV = Mockito.mock(SonyTV.class);

    @Test
    public void on() throws Exception {

        doNothing().when(sonyTV).on();
    }
    @Test
    public void off() {
        doNothing().when(sonyTV).off();
    }

    @Test
    public void switchChannel() {
        doNothing().when(sonyTV).switchChannel(12);

    }

}
