package com.nefeshdev.chama.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nefeshdev.chama.entity.User;
import java.util.List;

public interface UserRepository extends JpaRepository<User, UUID> {
    Optional<User> findByName(String name);
}
