package com.nefeshdev.chama.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nefeshdev.chama.entity.Task;

public interface TaskRepository extends JpaRepository<UUID, Task> {
}
