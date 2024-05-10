package ru.smirnova.spring.kursovaya.repositories;

import ru.smirnova.spring.kursovaya.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}