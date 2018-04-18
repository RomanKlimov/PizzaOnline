package ru.itis.pizzaonline.services.interfaces;

import ru.itis.pizzaonline.models.Pizza;
import ru.itis.pizzaonline.models.User;
import ru.itis.pizzaonline.security.Role.Role;

import java.util.List;
import java.util.Optional;

public interface AdminService {
    List<User> getAllUsersByRole(Role role);
    List<Pizza> getAllPizzas();
    void addUser(User user);
    Optional<User> getUserByEmail(String email);
    User deleteUser(String email);
}
