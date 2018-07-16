package com.assuresoftBuilder.Test;

import com.assuresoftBuilder.CDtype;
import com.assuresoftBuilder.Packing;
import com.assuresoftBuilder.Sony;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Matchers;

import java.util.ArrayList;
import java.util.List;
import static jdk.internal.dynalink.support.Guards.isNotNull;
import static org.mockito.Matchers.isNull;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;


public class CDtypeTest {

    private CDtype cDtype;
    private List<Packing> items=new ArrayList<Packing>();

    @Before
    public void setUpMocks(){
        cDtype=mock(CDtype.class);
    }
    @Test
    public void addItemWhenIsNull() {
        doNothing().when(cDtype).addItem((Packing) isNull());
        cDtype.addItem(null);
    }
    @Test
    public void addItemWhenIsObject() {
       doNothing().when(cDtype).addItem((Packing) Matchers.isNotNull());
        cDtype.addItem(new Sony());
    }
    @Test
    public void getCost() throws Exception{
        doNothing().when(cDtype).getCost();

    }

    @Test
    public void showItems() throws Exception{
        doNothing().when(cDtype).showItems();

    }
}
