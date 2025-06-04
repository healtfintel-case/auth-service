package com.arslankucukkafa.dev.authservice;

import com.arslankucukkafa.dev.authservice.entity.User;
import com.arslankucukkafa.dev.authservice.repository.UserRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import java.time.LocalDateTime;

@SpringBootApplication
@EnableDiscoveryClient
public class AuthServiceApplication {

    private final UserRepository userRepository;

    public AuthServiceApplication(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(AuthServiceApplication.class, args);
    }


    @PostConstruct
    public void createDefaultUser() {
        User defaultUser = new User();
        defaultUser.setUsername("ArslanKucukkafa");
        defaultUser.setPassword("ArslanKucukkafaPassword");
        defaultUser.setEmail("arslankucukkafa@mail");
        defaultUser.setRole("USER");
        defaultUser.setEnabled(true);
        defaultUser.setCreatedAt(LocalDateTime.now());
        userRepository.save(defaultUser);
    }
}
