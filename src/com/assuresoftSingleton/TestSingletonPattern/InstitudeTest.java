package com.assuresoftSingleton.TestSingletonPattern;

import com.assuresoftSingleton.*;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Matchers.isA;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
public class InstitudeTest {
    Institude institude = new Institude();
   private Institude instance;
    @Before
    public void seUpMock(){

        instance=mock(Institude.class);
    }

    @Test
    public void getInstance() {

        assertNotNull(institude.getInstance());
    }

    @Test
    public void getNameInstitute() {

        assertNotNull(institude.getNameInstitute());
    }

    @Test
    public void setNameInstitute() throws Exception{
        doNothing().when(instance).setNameInstitute(isA(String.class));

    }
}
