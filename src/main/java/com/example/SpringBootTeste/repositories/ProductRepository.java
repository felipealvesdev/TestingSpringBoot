package com.example.SpringBootTeste.repositories;
import com.example.SpringBootTeste.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
