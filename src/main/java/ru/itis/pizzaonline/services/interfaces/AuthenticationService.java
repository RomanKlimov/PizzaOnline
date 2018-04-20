package ru.itis.pizzaonline.services.interfaces;

import org.springframework.security.core.Authentication;
import ru.itis.pizzaonline.models.User;

public interface AuthenticationService {
    User getUserByAuthentication(Authentication authentication);
}
