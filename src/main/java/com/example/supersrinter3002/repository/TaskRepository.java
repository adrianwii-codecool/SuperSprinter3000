package com.example.supersrinter3002.repository;

import com.example.supersrinter3002.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
