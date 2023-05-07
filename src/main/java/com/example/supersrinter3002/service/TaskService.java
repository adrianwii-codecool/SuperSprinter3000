package com.example.supersrinter3002.service;

import com.example.supersrinter3002.entity.Task;
import com.example.supersrinter3002.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Task> getTasks() {
        return this.taskRepository.findAll();
    }

    public void addTask(Task task) {
        this.taskRepository.save(task);
    }
}
