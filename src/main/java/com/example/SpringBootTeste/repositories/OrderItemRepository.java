package com.example.SpringBootTeste.repositories;

import com.example.SpringBootTeste.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
