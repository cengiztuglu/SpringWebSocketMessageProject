package com.example.SpringWebSocketMessageProject.repo;

import com.example.SpringWebSocketMessageProject.entity.Message;
import com.example.SpringWebSocketMessageProject.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
 public interface MessageRepository extends JpaRepository<Message, Long> {
}