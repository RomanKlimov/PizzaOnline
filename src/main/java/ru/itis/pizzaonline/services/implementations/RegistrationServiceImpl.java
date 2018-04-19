package ru.itis.pizzaonline.services.implementations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.itis.pizzaonline.exceptions.EmailExistsException;
import ru.itis.pizzaonline.models.User;
import ru.itis.pizzaonline.models.VerificationToken;
import ru.itis.pizzaonline.repositories.UserRepository;
import ru.itis.pizzaonline.repositories.VerificationTokenRepository;
import ru.itis.pizzaonline.services.interfaces.RegistrationService;

@Service
public class RegistrationServiceImpl implements RegistrationService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private VerificationTokenRepository verificationTokenRepository;

    @Autowired
    private EmailServiceImpl emailService;


    @Override
    public void createUserAccount(User user) throws EmailExistsException {
        if (!userRepository.findFirstByEmailOrPhoneNumber(user.getEmail(),user.getPhoneNumber()).isPresent()){
            userRepository.save(user);
            emailService.sendMail(user);
        }
        else throw new EmailExistsException("There is an account with that email address or phone number: " + user.getEmail());
    }


    @Override
    public User getUserByToken(String token){
        return verificationTokenRepository.findByToken(token).getUser();
    }

    @Override
    public VerificationToken getVerificationToken(String verificationToken) {
        return verificationTokenRepository.findByToken(verificationToken);
    }

    @Override
    public void createVerificationToken(User user, String token) {
        VerificationToken verificationToken = new VerificationToken(user, token);
        verificationTokenRepository.save(verificationToken);
    }

    @Override
    public void confirmPassword(User user){
        userRepository.save(user);
    }

    @Override
    public void remove(String token){
        verificationTokenRepository.deleteByToken(token);
    }
}
