package com.nefeshdev.chama.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tb_user")
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "user_name")
    private String name;

    @Column(name = "user_email")
    private String email;

    @Column(name = "user_email")
    private String password;

    @OneToMany(mappedBy = "user")
    private List<Task> task = new ArrayList<>();

    @Builder
    public User(UUID id, String name, String email, String password, List<Task> task) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.task = task != null ? task : new ArrayList<>();
    }
}
