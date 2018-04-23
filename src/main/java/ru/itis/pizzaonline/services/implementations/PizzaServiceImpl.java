package ru.itis.pizzaonline.services.implementations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.itis.pizzaonline.models.Pizza;
import ru.itis.pizzaonline.repositories.ObjectDeleteJDBC;
import ru.itis.pizzaonline.repositories.PizzaRepository;
import ru.itis.pizzaonline.services.interfaces.PizzaService;

import java.util.List;

@Service
public class PizzaServiceImpl implements PizzaService {

    @Autowired
    private PizzaRepository pizzaRepository;

    @Autowired
    private ObjectDeleteJDBC objectDeleteJDBC;


    @Override
    public void addPizza(Pizza pizza) {
        pizzaRepository.save(pizza);
    }

    @Override
    public List<Pizza> getAllPizzas() {
        return pizzaRepository.findAll();
    }

    @Override
    public void deletePizza(Long id) {
        objectDeleteJDBC.deletePizzaByAdmin(id);

    }

    @Override
    public Pizza getPizzaById(Long id) {
        return pizzaRepository.getOne(id);
    }

}
