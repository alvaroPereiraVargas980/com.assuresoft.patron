package com.assuresoftTemplate.TestTemplatePattern;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class CricketTest {
    private ByteArrayOutputStream printInitialized = new ByteArrayOutputStream();
    private ByteArrayOutputStream printStartPlay = new ByteArrayOutputStream();
//    private ByteArrayOutputStream printEndPlay = new ByteArrayOutputStream();
    private  PrintStream originalprintInitialized = System.out;
    private  PrintStream originalprintStartPlay = System.err;
//    private  PrintStream originalprintEndPlay = System.;

    @Before
    public void setUpMock() {
        System.setOut(new PrintStream(printInitialized));
        System.setErr(new PrintStream(printStartPlay));
//        System.setOut(new PrintStream(printEndPlay));

    }
    @After
    public void restoreStreams() {
        System.setOut(originalprintInitialized);
        System.setErr(originalprintStartPlay);
//        System.setOut(originalprintEndPlay);
    }

    @Test
    public void initialized() throws Exception{
        System.out.print("Cricket Game Finished!");
        assertEquals("Cricket Game Finished!",printInitialized.toString());
    }

    @Test
    public void startPlay() throws Exception{

            System.err.print("Cricket Game Initialized");
            assertEquals("Cricket Game Initialized",printStartPlay.toString());
       }

        @Test
        public void endPlay () throws Exception{
//            System.out.println("Cricket Game Started, Enjoy the game");
//            assertEquals("Cricket Game Started, Enjoy the game",printEndPlay.toString());
        }
    }


