package com.matrixglitch.learnspringsecurity.resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TodoResource {

    private Logger logger = LoggerFactory.getLogger(getClass());

    public static final List<Todo> TODOS = List.of(new Todo("Avinash", "Learn AWS"),
            new Todo("Avinash", "Learn AWS"));

    @GetMapping("/todos")
    public List<Todo> retrieveAllTodos(){
        return TODOS;
    }

    @GetMapping("/users/{username}/todos")
    public Todo retrieveTodosForSpecificUser(@PathVariable String username){
        return TODOS.get(0);
    }

    @PostMapping("/users/{username}/todos")
    public void createTodoForSpecificUser(@PathVariable String username, @RequestBody Todo todo){
       logger.info("Create {} for {}", todo, username);
    }
}

record Todo (String username , String description){}
