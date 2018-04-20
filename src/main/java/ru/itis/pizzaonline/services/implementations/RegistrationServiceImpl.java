package ru.itis.pizzaonline.services.implementations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.itis.pizzaonline.exceptions.EmailExistsException;
import ru.itis.pizzaonline.models.User;
import ru.itis.pizzaonline.repositories.UserRepository;
import ru.itis.pizzaonline.services.interfaces.RegistrationService;

@Service
public class RegistrationServiceImpl implements RegistrationService {

    @Autowired
    private UserRepository userRepository;



    @Override
    public void createUserAccount(User user) throws EmailExistsException {
        if (!userRepository.findFirstByEmailOrPhoneNumber(user.getEmail(),user.getPhoneNumber()).isPresent()){
            userRepository.save(user);
        }
        else throw new EmailExistsException("There is an account with that email address or phone number: " + user.getEmail());
    }

}
