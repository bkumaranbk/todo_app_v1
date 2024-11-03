package com.irusri.todo_app.controller;

import com.irusri.todo_app.dto.TodoDTO;
import com.irusri.todo_app.model.Todo;
import com.irusri.todo_app.model.User;
import com.irusri.todo_app.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/todos")
public class TodoController {
    @Autowired
    private TodoService todoService;

    @GetMapping
    public List<Todo> getAllTodos() {
        return todoService.findAll();
    }

    @PostMapping
    public Todo createTodo(@RequestBody TodoDTO dto) {
        Todo todo = new Todo();
        todo.setTitle(dto.getTitle());
        todo.setDescription(dto.getDescription());
        todo.setCompleted(dto.isCompleted());
        return todoService.save(todo);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Todo> updateTodo(@PathVariable Long id, @RequestBody TodoDTO dto) {
        return todoService.getTodoById(id).map(todo -> {
            todo.setTitle(dto.getTitle());
            todo.setDescription(dto.getDescription());
            todo.setCompleted(dto.isCompleted());
            return ResponseEntity.ok(todoService.save(todo));
        }).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public void deleteTodoById(@PathVariable Long id) {
        todoService.deleteTodoById(id);
    }
}