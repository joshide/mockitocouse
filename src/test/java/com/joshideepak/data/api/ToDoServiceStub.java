package com.joshideepak.data.api;

import java.util.Arrays;
import java.util.List;

public class ToDoServiceStub implements ToDoService {

    public List<String> retriveToDos(String user) {
        return Arrays.asList("Learn Spring", "Learn Spring MVC", " Learn to dance");
    }
}
