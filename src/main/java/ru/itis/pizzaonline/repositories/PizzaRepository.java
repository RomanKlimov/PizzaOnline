package ru.itis.pizzaonline.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.itis.pizzaonline.models.Pizza;


@Repository
public interface PizzaRepository extends JpaRepository<Pizza, Long> {
}
