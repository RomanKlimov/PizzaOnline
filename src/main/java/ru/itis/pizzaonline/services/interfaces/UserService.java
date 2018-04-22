package ru.itis.pizzaonline.services.interfaces;

import ru.itis.pizzaonline.exceptions.EmailExistsException;
import ru.itis.pizzaonline.models.User;

public interface UserService {
    void updateUser(User client);

    void createUserAccount(User user) throws EmailExistsException;

}
