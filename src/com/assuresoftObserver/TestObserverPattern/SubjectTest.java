package com.assuresoftObserver.TestObserverPattern;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import com.assuresoftObserver.*;
import org.mockito.Matchers;
import org.mockito.Mockito;
import org.mockito.Spy;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

public class SubjectTest {
    private Subject subject;
    private  Observer observer;
    @Before
    public void setUpMock(){
        subject=mock(Subject.class);
        observer=mock(Observer.class);

    }

    @Test
    public void getState() {
      when(subject.getState()).thenReturn(20);
      assertEquals(20,subject.getState());
    }

    @Test
    public void setState() {
        subject.notifyAllOnservers();
        verify(subject, atLeastOnce()).notifyAllOnservers();
    }

    @Test
    public void attach() {
        List<Observer> observerList= new ArrayList<>();
        List spy= Mockito.spy(observerList);
        doReturn(true).when(spy).add(observer);
        assertTrue(spy.add(observer));

    }

    @Test
    public void notifyAllOnservers() {
        Iterator<Object> iterator = mock(Iterator.class);
        List<Object> list = mock(List.class);
        Object object = mock(Object.class);
        when(list.iterator()).thenReturn(iterator);
        when(iterator.hasNext()).thenReturn(true, false);
        when(iterator.next()).thenReturn(object);


    }
}
