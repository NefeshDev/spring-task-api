package com.nefeshdev.chama.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nefeshdev.chama.entity.User;

public interface UserRepository extends JpaRepository<UUID, User> {

}
