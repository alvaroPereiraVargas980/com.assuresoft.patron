package com.assuresoftIterator.TestIteratorPattern;

import com.assuresoftIterator.*;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class NameRepositoryTest {
    private Iterator iterator;
    private NameRepository nameRepository;

    @Before
    public void setUpMock(){
        iterator=mock(Iterator.class);
        nameRepository=mock(NameRepository.class);
    }
    @Test
    public void getIterator() {
        when(nameRepository.getIterator()).thenReturn(iterator);
        assertNotNull(nameRepository.getIterator());

    }
}
