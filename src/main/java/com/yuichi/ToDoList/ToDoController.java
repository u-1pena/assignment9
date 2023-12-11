package com.yuichi.ToDoList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ToDoController {
    private final ToDoService toDoService;

    public ToDoController(ToDoService toDoService) {
        this.toDoService = toDoService;

    }

    //GET
    @GetMapping("/todos/{id}")
    public ToDo getToDo(@PathVariable("id") int id) {
        return toDoService.findToDo(id);
    }


}
