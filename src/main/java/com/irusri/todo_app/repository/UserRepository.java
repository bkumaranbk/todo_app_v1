package com.irusri.todo_app.repository;

import com.irusri.todo_app.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username); // Ensure this method is defined
}
