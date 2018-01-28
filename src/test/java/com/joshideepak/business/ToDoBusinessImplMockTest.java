package com.joshideepak.business;

import java.util.Arrays;
import java.util.List;
import com.joshideepak.data.api.ToDoService;
import com.joshideepak.data.api.ToDoServiceStub;
import com.sun.tools.javac.comp.Todo;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ToDoBusinessImplMockTest {

    @Test
    public void testRetrieveTodosRelatedToSpring_EmptyList() {

        ToDoService toDoServiceMock = mock(ToDoService.class);

        ToDoBusinessImpl toDoBusiness = new ToDoBusinessImpl(toDoServiceMock);
        List<String> todos = toDoBusiness.retriveTodosRelatedToSpring("dummy user");
        //by default mockito return nice mocks : default values
        assertEquals(0, todos.size());
    }

    @Test
    public void testRetrieveTodosRelatedToSpring() {

        ToDoService toDoServiceMock = mock(ToDoService.class);

        ToDoBusinessImpl toDoBusiness = new ToDoBusinessImpl(toDoServiceMock);
        //stubbing the method
        when(toDoServiceMock.retriveToDos("dummy user")).thenReturn(Arrays.asList("Spring 1", "Spring 2"));
        List<String> todos = toDoBusiness.retriveTodosRelatedToSpring("dummy user");
        assertEquals(2, todos.size());
    }
}
