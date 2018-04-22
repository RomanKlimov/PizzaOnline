package ru.itis.pizzaonline.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import ru.itis.pizzaonline.forms.PizzaForm;
import ru.itis.pizzaonline.models.Cart;
import ru.itis.pizzaonline.models.Pizza;
import ru.itis.pizzaonline.models.User;
import ru.itis.pizzaonline.services.implementations.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Controller
public class HomeController {

    @Autowired
    private AuthenticationServiceImpl service;

    @Autowired
    private PizzaServiceImpl pizzaService;

    @Autowired
    private UserServiceImpl userService;

    @Autowired
    private CartServiceImpl clientPizzaService;

    @GetMapping(value = "/home")
    public String home(@ModelAttribute("model") ModelMap modelMap) {
//        List<Pizza> pizzaList = (List<Pizza>) httpServletRequest.getSession().getAttribute("pizzaList");
        List<Pizza> pizzaList = pizzaService.getAllPizzas();
        System.out.println(Arrays.asList(pizzaList));
        modelMap.addAttribute("list", pizzaList);
        return "guest/home";
    }

    @PostMapping(value = "/toCart")
    @ResponseBody
    public ResponseEntity toCart(@Valid PizzaForm pizzaForm, BindingResult bindingResult, Authentication authentication, ModelMap modelMap) {
        if (!bindingResult.hasErrors()){
            if (authentication != null) {
                User user = service.getUserByAuthentication(authentication);
                Pizza originPizza = pizzaService.getPizzaById(pizzaForm.getPizzaId()); // do by optional and check it
                Optional<Cart> clientPizzaOptional = clientPizzaService.getClientPizza(originPizza);
                if (clientPizzaOptional.isPresent()){
                    Cart cart = clientPizzaOptional.get();
                    cart.setCount(pizzaForm.getCount());
                    clientPizzaService.addPizza(cart);
                    return ResponseEntity.ok().build();
                }
                Cart cart = new Cart();
                cart.setPizza(originPizza);
                cart.setCount(pizzaForm.getCount());
                cart.setUser(user);
                clientPizzaService.addPizza(cart);
            }
        }
        return ResponseEntity.ok().build();
    }

}
