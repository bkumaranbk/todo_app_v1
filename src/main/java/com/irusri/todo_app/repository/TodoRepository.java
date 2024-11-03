package com.irusri.todo_app.repository;

import com.irusri.todo_app.model.Todo;
import com.irusri.todo_app.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface TodoRepository extends JpaRepository<Todo, Long> {
    Page<Todo> findByUser(User user, Pageable pageable);
}