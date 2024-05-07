package com.example.SpringWebSocketMessageProject.config.api;

import com.example.SpringWebSocketMessageProject.entity.Message;
import com.example.SpringWebSocketMessageProject.entity.User;
import com.example.SpringWebSocketMessageProject.service.MessageService;
import com.example.SpringWebSocketMessageProject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

import java.util.Date;

@Controller
public class WebSocketChatController {
    @Autowired
    private SimpMessagingTemplate messagingTemplate;

    @Autowired
    private MessageService messageService;

    @Autowired
    private UserService userService;

    @MessageMapping("/chat")
    public void handleChatMessage(Message message) {
        User sender = userService.getUserByUsername(message.getSender().getUsername());
        if (sender == null) {
            sender = userService.saveUser(message.getSender());
        }
        message.setSender(sender);
        message.setSenderDate(new Date());
        Message savedMessage = messageService.saveMessage(message);
        messagingTemplate.convertAndSend("/topic/messages", savedMessage);
    }
}
