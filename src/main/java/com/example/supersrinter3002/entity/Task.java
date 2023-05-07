package com.example.supersrinter3002.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Task {
    private Long id;
    private String title;
    private String description;
    private Double estimationTime;
}
