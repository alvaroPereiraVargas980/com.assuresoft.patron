package com.assuresoftBuilder.Test;


import com.assuresoftBuilder.Samsung;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class SamsungTest {
 private Samsung samsung;

   @Before
    public void setUpMock(){
       samsung=mock(Samsung.class);

   }
    @Test
    public void price() {
       when(samsung.price()).thenReturn(20);
       assertEquals(20,samsung.price());
    }

    @Test
    public void pack() {
       when(samsung.pack()).thenReturn("Samsumg Cd");
       assertEquals("Samsumg Cd", samsung.pack());
    }
}
