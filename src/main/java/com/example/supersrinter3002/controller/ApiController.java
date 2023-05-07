package com.example.supersrinter3002.controller;

import com.example.supersrinter3002.DTO.TaskDTO;
import com.example.supersrinter3002.entity.Task;
import com.example.supersrinter3002.service.TaskService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class ApiController {

    private final TaskService taskService;

    public ApiController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("/tasks")
    @ResponseBody
    public List<Task> getAllTask() {
        return taskService.getTasks();
    }

    @PostMapping("/api/add-task")
    public String saveTask(@RequestBody TaskDTO taskDto) {
        this.taskService.addTask(new Task(null, taskDto.getTitle(), taskDto.getDescription(), taskDto.getEstimationTime()));
        return "OK";
    }
}
