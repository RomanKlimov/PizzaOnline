package ru.itis.pizzaonline.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.sql.PreparedStatement;

@Component
public class ObjectDeleteJDBC {

    private final String DELETE_PIZZA_FROM_CART = "DELETE FROM carts WHERE id=?";
    private final String DELETE_PIZZA = "DELETE FROM pizzas WHERE id=?";
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void deletePizzaFromCart(Long id){
        jdbcTemplate.update(connection -> {
            PreparedStatement statement = connection.prepareStatement(DELETE_PIZZA_FROM_CART);
            statement.setLong(1, id);
            return statement;
        });
    }

    public void deletePizzaByAdmin(Long id){
        jdbcTemplate.update(connection -> {
            PreparedStatement statement = connection.prepareStatement(DELETE_PIZZA);
            statement.setLong(1,id);
            return statement;
        });
    }



}
