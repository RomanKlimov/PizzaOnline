package ru.itis.pizzaonline.services.implementations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.itis.pizzaonline.models.Pizza;
import ru.itis.pizzaonline.models.User;
import ru.itis.pizzaonline.repositories.PizzaRepository;
import ru.itis.pizzaonline.repositories.UserRepository;
import ru.itis.pizzaonline.security.Role.Role;
import ru.itis.pizzaonline.services.interfaces.AdminService;

import java.util.List;
import java.util.Optional;

@Service
public class AdminServiceImpl implements AdminService{

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PizzaRepository pizzaRepository;

    @Override
    public List<User> getAllUsersByRole(Role role) {
        return userRepository.findAllByRole(role);
    }

    @Override
    public List<Pizza> getAllPizzas() {
        return pizzaRepository.findAll();
    }

    @Override
    public void addUser(User user) {
        userRepository.save(user);
    }

    @Override
    public Optional<User> getUserByEmail(String email) {
        return userRepository.findFirstByEmail(email);
    }

    @Override
    public User deleteUser(String email) {
        User user = userRepository.deleteByEmail(email);
        return user;

    }
}
