package com.example.SpringBootTeste.services;

import com.example.SpringBootTeste.entities.User;
import com.example.SpringBootTeste.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }

    public User findBydId(Long id) {
        Optional<User> obj = repository.findById(id);
        return obj.get();
    }

}
