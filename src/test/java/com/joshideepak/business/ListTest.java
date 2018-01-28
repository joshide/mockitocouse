package com.joshideepak.business;

import java.util.List;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

// Mocking List Behaviours
public class ListTest {

    //Multiple return values
    @Test
    public void mockListSizeMethod_MultipleReturnValues(){

        List list = mock(List.class);
        //Stubbing the method
        when(list.size()).thenReturn(2).thenReturn(3);

        assertEquals(2,list.size());
        assertEquals(3,list.size());
    }

    //Argument Matching
    @Test
    public void mockListGetMethod(){

        List list = mock(List.class);
        when(list.get(anyInt())).thenReturn(2);

        assertEquals(2, list.get(1));
        assertEquals(2, list.get(3));

    }

    //Throwing Exception
    @Test(expected = RuntimeException.class)
    public void mockListGetMethod_ExceptionHandling(){

        List list = mock(List.class);
        when(list.get(anyInt())).thenThrow(new RuntimeException("Some Exception"));

        list.get(2);
        list.get(3);
    }


}
