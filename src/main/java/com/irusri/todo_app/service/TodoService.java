package com.irusri.todo_app.service;

import com.irusri.todo_app.model.Todo;
import com.irusri.todo_app.model.User;
import com.irusri.todo_app.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TodoService {
    @Autowired
    private TodoRepository todoRepository;

    public Page<Todo> getTodosByUser(User user, Pageable pageable) {
        return todoRepository.findByUser(user, pageable);
    }

    public Optional<Todo> getTodoById(Long id) {
        return todoRepository.findById(id);
    }

    public Todo saveTodo(Todo todo) {
        return todoRepository.save(todo);
    }

    public void deleteTodoById(Long id) {
        todoRepository.deleteById(id);
    }

    public List<Todo> findAll() {
        return todoRepository.findAll(); // Fetch all Todos
    }

    public Todo save(Todo todo) {
        return todoRepository.save(todo); // Save a new or updated Todo
    }

}