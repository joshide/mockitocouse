package com.joshideepak.business;

import java.util.ArrayList;
import java.util.List;
import com.joshideepak.data.api.ToDoService;

//ToDoBussinessImpl : SUT (System Under Test)
public class ToDoBusinessImpl {

    private ToDoService toDoService;

    public  ToDoBusinessImpl(ToDoService toDoService) {
        this.toDoService = toDoService;
    }

    public List<String> retriveTodosRelatedToSpring(String user) {

        List<String> filteredTodos = new ArrayList<String>();
        List<String> todos = toDoService.retriveToDos(user);
        for(String todo : todos) {
            if(todo.contains("Spring")) {
                filteredTodos.add(todo);
            }
        }
        return filteredTodos;
    }
}
