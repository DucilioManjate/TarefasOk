package com.example.backend.tasks;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TasksRepository  extends JpaRepository<TasksEntity, Long> {
}
