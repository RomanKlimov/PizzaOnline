package ru.itis.pizzaonline.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import ru.itis.pizzaonline.exceptions.EmailExistsException;
import ru.itis.pizzaonline.forms.UserRegistrationForm;
import ru.itis.pizzaonline.models.User;
import ru.itis.pizzaonline.security.Role.Role;
import ru.itis.pizzaonline.services.interfaces.UserService;
import ru.itis.pizzaonline.validators.UserRegistrationFormValidator;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@Controller
public class RegistrationController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserRegistrationFormValidator userRegistrationFormValidator;

    // @Autowired
    private MessageSource messages;

    private PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    @InitBinder("userForm")
    public void initUserFormValidator(WebDataBinder binder){
        binder.addValidators(userRegistrationFormValidator);
    }


    @PostMapping("/signUp")
    public String registerUserAccount(@ModelAttribute("userForm") @Valid UserRegistrationForm userRegistrationForm,
                                      BindingResult errors, WebRequest request, RedirectAttributes attributes, HttpServletRequest httpServletRequest, ModelMap modelMap) throws EmailExistsException {
        if (errors.hasErrors()){
            attributes.addFlashAttribute("error" , errors.getAllErrors().get(0).getDefaultMessage());
            return "redirect:/home";
        }
        String hashPass = passwordEncoder.encode(userRegistrationForm.getPassword());
        User user = User.builder()
                .name(userRegistrationForm.getName())
                .email(userRegistrationForm.getEmail())
                .phoneNumber(userRegistrationForm.getPhoneNumber())
                .hashPassword(hashPass)
                .role(Role.CLIENT)
                .build();
        userService.createUserAccount(user);

        return "redirect:/home";
    }

}
