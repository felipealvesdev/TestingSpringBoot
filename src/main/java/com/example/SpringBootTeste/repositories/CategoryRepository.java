package com.example.SpringBootTeste.repositories;
import com.example.SpringBootTeste.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
