package ru.itis.pizzaonline.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itis.pizzaonline.models.Pizza;

public interface PizzaRepository extends JpaRepository<Pizza, Long> {
    void deleteByPizzaName(String name);

}
