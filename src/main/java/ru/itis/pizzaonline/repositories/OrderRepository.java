package ru.itis.pizzaonline.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.itis.pizzaonline.models.Order;
import ru.itis.pizzaonline.models.User;

import java.util.List;
import java.util.Optional;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findAllByIsActiveTrue();
    Optional<Order> findFirstById(Long id);
    List<Order> findAllByCourierAndCompletedTrue(User user);
    List<Order> findAllByCourierAndCompletedFalse(User user);
}
