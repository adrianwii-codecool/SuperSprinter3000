package com.example.supersrinter3002.controller;

import com.example.supersrinter3002.entity.Task;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MainController {

    @GetMapping("")
    public String index(Model model) {
        Task task1 = new Task(1L, "Clean bathroom", "Clean bathroom and prepare clothes for washing machine", 2.34);
        Task task2 = new Task(2L, "Clean car", "...", 0.5);

        List<Task> tasksList = List.of(task1, task2);

        model.addAttribute("tasks", tasksList);
        return "index";
    }
}
