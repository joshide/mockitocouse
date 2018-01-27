package com.joshideepak.business;

import java.util.List;
import com.joshideepak.data.api.ToDoService;
import com.joshideepak.data.api.ToDoServiceStub;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ToDoBusinessImplStubTest {

    @Test
    public void testRetriveTodosRelatedToSpring() {

        ToDoService toDoServiceStub = new ToDoServiceStub();
        ToDoBusinessImpl toDoBusiness = new ToDoBusinessImpl(toDoServiceStub);
        List<String> todosRelatedToSpringList = toDoBusiness.retriveTodosRelatedToSpring("dummyUser");
        assertEquals(2,todosRelatedToSpringList.size());

    }
}
