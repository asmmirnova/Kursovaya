package ru.smirnova.spring.kursovaya.repositories;

import ru.smirnova.spring.kursovaya.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    Iterable<Order> findAllByUserId(long customUserId);
}