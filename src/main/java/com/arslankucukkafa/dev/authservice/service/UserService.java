package com.arslankucukkafa.dev.authservice.service;

import com.arslankucukkafa.dev.authservice.dto.UserDto;
import com.arslankucukkafa.dev.authservice.entity.User;
import com.arslankucukkafa.dev.authservice.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<UserDto> getUsers () {
        return userRepository.findAll().stream()
                .map(user -> new UserDto(user.getEmail(), user.getUsername()))
                .toList();
    }

    public UserDto getUserById(Long id) {
    User user = userRepository.findById(id)
            .orElse(new User());

    return new UserDto(user.getEmail(), user.getUsername());
    }

    public UserDto getUserByEmail(String email) {
        User user = userRepository.findByEmail(email)
                .orElse(new User());

        return new UserDto(user.getEmail(), user.getUsername());
    }

}
