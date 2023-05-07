package com.example.supersrinter3002.DTO;

import lombok.Getter;

@Getter
public class TaskDTO {
    private String title;
    private String description;
    private Double estimationTime;

    public TaskDTO(String title, String description, Double estimationTime) {
        this.title = title;
        this.description = description;
        this.estimationTime = estimationTime;
    }
}
