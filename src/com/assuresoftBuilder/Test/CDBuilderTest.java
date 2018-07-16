package com.assuresoftBuilder.Test;

import com.assuresoftBuilder.CDBuilder;
import com.assuresoftBuilder.CDtype;
import com.assuresoftBuilder.Packing;
import com.assuresoftBuilder.Sony;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.mock;
import static org.junit.Assert.*;
import static org.mockito.Mockito.when;
import java.util.*;


public class CDBuilderTest {

    private CDtype cDtype;
    private  CDBuilder cdBuilder;

    @Before
    public void setUpMocks(){
        cDtype = mock(CDtype.class);
        cdBuilder=mock(CDBuilder.class);

    }

    @Test
    public void buildSony() {
        when(cdBuilder.buildSony()).thenReturn(cDtype);
        assertNotNull(cdBuilder.buildSony());
    }

    @Test
    public void buildSamsung() {
        when(cdBuilder.buildSamsung()).thenReturn(cDtype);
        assertNotNull(cdBuilder.buildSamsung());
    }
}
