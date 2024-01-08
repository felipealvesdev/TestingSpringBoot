package com.example.SpringBootTeste.repositories;

import com.example.SpringBootTeste.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
