package com.assuresoftObserver.TestObserverPattern;

import com.assuresoftObserver.*;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.*;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BinaryObserverTest {
    private ByteArrayOutputStream print = new ByteArrayOutputStream();
    private Subject subject;
    private BinaryObserver binaryObserver;
    @Before
    public void setUpMock(){
        System.setOut(new PrintStream(print));
        subject=mock(Subject.class);
        binaryObserver=mock(BinaryObserver.class);

    }


    @Test
    public void update() throws Exception{

        doNothing().when(binaryObserver).update();
        when(subject.getState()).thenReturn(20);
        System.out.println("Binary String " + Integer.toBinaryString(subject.getState()));
//        assertEquals("Binary String 10100",print.toString());


    }
}

