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

import javax.servlet.http.HttpServletResponse;
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
    private CartServiceImpl cartService;

    @Autowired
    private FileInfoServiceImpl fileInfoService;

    @GetMapping(value = "/home")
    public String home(@ModelAttribute("model") ModelMap modelMap) {
        List<Pizza> pizzaList = pizzaService.getAllPizzas();
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
                Optional<Cart> clientPizzaOptional = cartService.getClientPizza(originPizza);
                if (clientPizzaOptional.isPresent()){
                    Cart cart = clientPizzaOptional.get();
                    cart.setCount(pizzaForm.getCount());
                    this.cartService.addPizza(cart);
                    return ResponseEntity.ok().build();
                }
                Cart cart = new Cart();
                cart.setPizza(originPizza);
                cart.setCount(pizzaForm.getCount());
                cart.setUser(user);
                this.cartService.addPizza(cart);
            }
        }
        return ResponseEntity.ok().build();
    }

    @GetMapping("/pic/{fileName:.+}")
    public void getPicture(@PathVariable("fileName") String fileName, HttpServletResponse response){
        fileInfoService.getPicture(fileName, response);
    }

}
