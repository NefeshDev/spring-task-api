package com.nefeshdev.chama.services;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.nefeshdev.chama.entity.Task;
import com.nefeshdev.chama.repository.TaskRepository;

@Service
public class TaskService {
    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Task> listarTaskByUserId(String userID) {
        return taskRepository.findByUserId(UUID.fromString(userID));
    }
}
