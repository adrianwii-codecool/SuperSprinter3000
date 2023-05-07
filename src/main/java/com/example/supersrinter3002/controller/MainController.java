package com.example.supersrinter3002.controller;

import com.example.supersrinter3002.entity.Task;
import com.example.supersrinter3002.service.TaskService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

    //TODO map object, not each params separetly
    @PostMapping("/add-task")
    public String postTask(
            @RequestParam("title") String title,
            @RequestParam("description") String description,
            @RequestParam("estimationTime") Double estimationTime
    ) {
        System.out.println(description);
        this.taskService.addTask(new Task(0L, title, description,estimationTime));
        return "redirect:/";
    }
}
