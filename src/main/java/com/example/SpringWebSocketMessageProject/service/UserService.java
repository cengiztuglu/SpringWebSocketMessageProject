package com.example.SpringWebSocketMessageProject.service;


import com.example.SpringWebSocketMessageProject.entity.Message;
import com.example.SpringWebSocketMessageProject.entity.User;
import com.example.SpringWebSocketMessageProject.repo.MessageRepository;
import com.example.SpringWebSocketMessageProject.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public User saveUser(User user) {
        return userRepository.save(user);
    }
    public User getUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}
