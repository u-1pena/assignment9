package com.yuichi.ToDoList;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ToDoService {
    private final ToDoMapper toDoMapper;

    public ToDoService(ToDoMapper toDoMapper) {
        this.toDoMapper = toDoMapper;
    }

    public ToDo findToDo(int id) {
        Optional<ToDo> todo = this.toDoMapper.findById(id);
        return todo.get();


    }

}
