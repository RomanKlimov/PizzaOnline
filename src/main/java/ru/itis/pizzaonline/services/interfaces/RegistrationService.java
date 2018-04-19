package ru.itis.pizzaonline.services.interfaces;

import ru.itis.pizzaonline.exceptions.EmailExistsException;
import ru.itis.pizzaonline.models.User;
import ru.itis.pizzaonline.models.VerificationToken;

public interface RegistrationService {
    void createUserAccount(User user) throws EmailExistsException;
    void createVerificationToken(User user, String token);
    VerificationToken getVerificationToken(String token);
    User getUserByToken(String token);
    void confirmPassword(User user);
    void remove(String token);
}
