package com.arslankucukkafa.dev.authservice.controller;

import com.arslankucukkafa.dev.authservice.dto.UserDto;
import com.arslankucukkafa.dev.authservice.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<UserDto> getUsers() {
        return userService.getUsers();
    }

    @GetMapping("/{id}")
    public UserDto getUserById(@PathVariable("id") Long id) {
        return userService.getUserById(id);
    }

    @GetMapping("/email/{email}")
    public UserDto getUserByEmail(@PathVariable("email") String email) {
        return userService.getUserByEmail(email);
    }
}
