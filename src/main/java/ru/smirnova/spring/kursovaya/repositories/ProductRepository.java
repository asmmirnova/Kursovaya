package ru.smirnova.spring.kursovaya.repositories;

import ru.smirnova.spring.kursovaya.entities.Product;
import ru.smirnova.spring.kursovaya.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    User findByName(String username);
}