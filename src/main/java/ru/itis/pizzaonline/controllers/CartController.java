package ru.itis.pizzaonline.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import ru.itis.pizzaonline.models.Cart;
import ru.itis.pizzaonline.models.User;
import ru.itis.pizzaonline.repositories.CartRepository;
import ru.itis.pizzaonline.services.implementations.AuthenticationServiceImpl;
import ru.itis.pizzaonline.services.implementations.CartServiceImpl;

import java.util.Arrays;
import java.util.List;

@Controller
public class CartController {

    @Autowired
    private AuthenticationServiceImpl service;

    @Autowired
    private CartServiceImpl cartService;

    @Autowired
    private CartRepository cartRepository;



    @GetMapping("/cart")
    public String getAllClientPizza( ModelMap modelMap, Authentication authentication){
        User user = service.getUserByAuthentication(authentication);
        List<Cart> carts = cartService.getAllPizzas(user);
        System.out.println(Arrays.asList(carts));
        modelMap.addAttribute("carts", carts);
        return "client/cart";
    }

    @PostMapping("/deleteFromCart")
    public String fromCart(@RequestParam(value = "cartId", required = true) Long id,Authentication authentication) {

            if (authentication != null) {
                User user = service.getUserByAuthentication(authentication);
                if(cartRepository.findFirstByIdAndUser(id, user).isPresent()) {
                    cartRepository.delete(id);
                }
            }

        return "redirect:/cart";
    }
}
