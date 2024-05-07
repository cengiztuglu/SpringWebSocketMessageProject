package com.example.SpringWebSocketMessageProject.repo;


import com.example.SpringWebSocketMessageProject.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    User findByUsername(String userName);
}
