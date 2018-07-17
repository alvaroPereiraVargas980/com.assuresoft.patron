package com.assuresoftAdapter.TestAdaterPatter;

import com.assuresoftAdapter.Socket;
import org.junit.Test;
import static org.junit.Assert.*;
public class SocketTest {

    @Test
    public void getVolt() {
        Socket socket=new Socket();
        assertNotNull(socket.getVolt());
    }
}
