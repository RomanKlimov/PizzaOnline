package ru.itis.pizzaonline.services.interfaces;

import ru.itis.pizzaonline.models.Pizza;

import java.util.List;

public interface PizzaService {
    void addPizza(Pizza pizza);
    List<Pizza> getAllPizzas();
    void deletePizza(Long id);

    Pizza getPizzaById(Long id);
}
