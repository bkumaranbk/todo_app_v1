package com.irusri.todo_app.dto;

import lombok.Data;

@Data
public class TodoDTO {
    private String title;
    private String description;
    private boolean completed;
}