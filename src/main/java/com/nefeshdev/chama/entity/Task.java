package com.nefeshdev.chama.entity;

import java.util.UUID;

import com.nefeshdev.chama.entity.Enum.StatusTask;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Builder;

@Entity
@Table(name = "tb_task")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String description;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Enumerated(EnumType.STRING)
    private StatusTask statusTask;

    @Builder
    public Task(UUID id, String description, User user, StatusTask statusTask) {
        this.id = id;
        this.description = description;
        this.user = user;
        this.statusTask = statusTask;
    }
}
