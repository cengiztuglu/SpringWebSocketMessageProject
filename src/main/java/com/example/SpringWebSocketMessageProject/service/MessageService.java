package com.example.SpringWebSocketMessageProject.service;

import com.example.SpringWebSocketMessageProject.entity.Message;
import com.example.SpringWebSocketMessageProject.entity.User;
import com.example.SpringWebSocketMessageProject.repo.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService {
    @Autowired
    private MessageRepository messageRepository;

    public Message saveMessage(Message message) {
        return messageRepository.save(message);
    }
}