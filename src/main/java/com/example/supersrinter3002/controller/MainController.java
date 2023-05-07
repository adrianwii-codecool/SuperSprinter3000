package com.example.supersrinter3002.controller;

import com.example.supersrinter3002.service.TaskService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    private final TaskService taskService;

    public MainController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("")
    public String index(Model model) {

        model.addAttribute("tasks", taskService.getTasks());
        return "index";
    }

    @GetMapping("/add-task")
    public String addTask() {
        return "addTask";
    }
}
