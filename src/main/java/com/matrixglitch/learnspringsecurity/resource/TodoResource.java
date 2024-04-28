package com.matrixglitch.learnspringsecurity.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TodoResource {
    public static final List<Todo> TODOS = List.of(new Todo("Avinash", "Learn AWS"),
            new Todo("Avinash", "Learn AWS"));

    @GetMapping("/todos")
    public List<Todo> retrieveAllTodos(){
        return TODOS;
    }
}

record Todo (String username , String description){}
