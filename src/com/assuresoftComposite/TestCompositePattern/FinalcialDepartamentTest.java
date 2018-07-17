package com.assuresoftComposite.TestCompositePattern;

import com.assuresoftCommand.Stock;
import com.assuresoftComposite.Department;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.junit.Assert.*;


public class FinalcialDepartamentTest {
    private ByteArrayOutputStream print = new ByteArrayOutputStream();
    private PrintStream originalPrint = System.out;
    private Department department;

    @Before
    public void seUpMock(){
        System.setOut(new PrintStream(print));
        department=mock(Department.class);
    }
    @After
    public void restoreStreams() {
        System.setOut(originalPrint);

    }
    @Test
    public void printDepartament() throws Exception{
        doNothing().when(department).printDepartament();
        System.out.print("FinancialDeparment");
        assertEquals("FinancialDeparment",print.toString());
    }
}
