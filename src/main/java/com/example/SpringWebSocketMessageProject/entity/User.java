package com.example.SpringWebSocketMessageProject.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
@Entity
@Table(name = "users")
@AllArgsConstructor
@EqualsAndHashCode(of={"id"})
@ToString
@Data
public class User {
    public User() {
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String username;

    public User(String username) {
        this.username = username;
    }


}