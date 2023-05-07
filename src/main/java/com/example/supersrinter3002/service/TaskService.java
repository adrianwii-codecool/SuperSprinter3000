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
//        Task task1 = new Task(1L, "Clean bathroom", "Clean bathroom and prepare clothes for washing machine", 2.34);
//        Task task2 = new Task(2L, "Clean car", "...", 0.5);
//        Task task3 = new Task(3L, "Clean office", "...", 0.5);
//
//        return List.of(task1, task2, task3);

        return this.taskRepository.findAll();
    }

    public void addTask(Task task) {
        this.taskRepository.save(task);
    }
}
