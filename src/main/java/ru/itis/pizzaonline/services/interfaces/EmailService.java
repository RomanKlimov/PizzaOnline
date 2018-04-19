package ru.itis.pizzaonline.services.interfaces;

import ru.itis.pizzaonline.models.User;

public interface EmailService  {
    void sendMail( User user);
}
