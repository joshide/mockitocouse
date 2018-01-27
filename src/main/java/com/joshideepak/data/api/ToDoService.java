package com.joshideepak.data.api;

import java.util.List;

//ToDOService : Dependency
public interface ToDoService {

    public List<String> retriveToDos(String user);
}
