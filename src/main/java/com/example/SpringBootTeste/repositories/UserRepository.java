package com.example.SpringBootTeste.repositories;

import com.example.SpringBootTeste.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
