package com.nefeshdev.chama.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.nefeshdev.chama.dto.register.RegisterRequestDTO;
import com.nefeshdev.chama.services.UserService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path = "/auth")
public class AuthController {

    private final UserService userService;

    public AuthController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public ResponseEntity<Void> registerNewUser(@RequestBody RegisterRequestDTO dto) {
        userService.criarUser(dto);
        return ResponseEntity.status(HttpStatusCode.valueOf(201)).build();
    }
}
