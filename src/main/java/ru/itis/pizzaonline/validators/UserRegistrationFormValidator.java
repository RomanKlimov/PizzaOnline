package ru.itis.pizzaonline.validators;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import ru.itis.pizzaonline.forms.UserRegistrationForm;
import ru.itis.pizzaonline.models.User;
import ru.itis.pizzaonline.repositories.UserRepository;

import java.util.Optional;

@Component
public class UserRegistrationFormValidator implements Validator {

    @Autowired
    private UserRepository userRepository;


    @Override
    public boolean supports(Class<?> aClass) {
        return aClass.getName().equals(UserRegistrationForm.class.getName());
    }

    @Override
    public void validate(Object target, Errors errors) {
        UserRegistrationForm form = (UserRegistrationForm) target;

        Optional<User> existUser = userRepository.findFirstByEmailOrPhoneNumber(form.getEmail(),form.getPhoneNumber());

        if (existUser.isPresent()){
            errors.reject("bad.phoneNumberOrEmail", "Уже зарегистрировано с таким номером или email-ом!");
        }
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "empty.name", "Пустая имя");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "phoneNumber", "empty.phoneNumber", "Пустой номер");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "empty.email", "Пустой email");
    }
}
