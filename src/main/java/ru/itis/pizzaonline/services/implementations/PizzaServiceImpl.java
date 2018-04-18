package ru.itis.pizzaonline.services.implementations;

import org.springframework.beans.factory.annotation.Autowired;
import ru.itis.pizzaonline.models.Pizza;
import ru.itis.pizzaonline.repository.PizzaRepository;
import ru.itis.pizzaonline.services.interfaces.PizzaService;

import java.util.List;

public class PizzaServiceImpl implements PizzaService {

    @Autowired
    private PizzaRepository pizzaRepository;

    @Override
    public void addPizza(Pizza pizza) {
        pizzaRepository.save(pizza);
    }

    @Override
    public List<Pizza> getAllPizzas() {
        return pizzaRepository.findAll();
    }

    @Override
    public void deletePizza(String name) {
        pizzaRepository.deleteByPizzaName(name);

    }
}
