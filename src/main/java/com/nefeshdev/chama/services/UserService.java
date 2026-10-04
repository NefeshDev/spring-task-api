package com.nefeshdev.chama.services;

import org.springframework.stereotype.Service;

import com.nefeshdev.chama.dto.register.RegisterRequestDTO;
import com.nefeshdev.chama.entity.User;
import com.nefeshdev.chama.repository.UserRepository;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void criarUser(RegisterRequestDTO dto) {
        User newUser = User.builder()
                .name(dto.name())
                .email(dto.email())
                .password(dto.password())
                .build();
        userRepository.save(newUser);
    }

}
