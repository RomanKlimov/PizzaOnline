package ru.itis.pizzaonline.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ru.itis.pizzaonline.forms.OrderForm;
import ru.itis.pizzaonline.models.Cart;
import ru.itis.pizzaonline.models.Order;
import ru.itis.pizzaonline.models.User;
import ru.itis.pizzaonline.services.implementations.AuthenticationServiceImpl;
import ru.itis.pizzaonline.services.interfaces.CartService;
import ru.itis.pizzaonline.services.interfaces.OrderService;

import javax.validation.Valid;
import java.util.List;

@Controller
public class OrderController {
    @Autowired
    private OrderService orderService;

    @Autowired
    private CartService cartService;

    @Autowired
    private AuthenticationServiceImpl service;

    @GetMapping("/orderPizza")
    public String orderPizza() {
        return "client/order";
    }

    @PostMapping("/successOrder")
    public String successOrder(@Valid OrderForm orderForm, BindingResult bindingResult, Authentication authentication, ModelMap modelMap) {
        if (!bindingResult.hasErrors()) {
            if (authentication != null) {
                User user = service.getUserByAuthentication(authentication);
                List<Cart> allCarts = cartService.getAllPizzas(user);
                long count = 0;
                long price = 0;
                for (Cart cart : allCarts) {
                    count += cart.getCount();
                    price += (count * cart.getPizza().getPrice());
                }
                String clientName = user.getName();
                Order order = new Order();
                order.setAddress(orderForm.getAddress());
                order.setClientName(clientName);
                order.setCountOfPizzas(count);
                order.setPrice(price);
                order.setIsActive(true);

                orderService.addOrder(order);
            }

        }
        return "client/successOrder";


    }
}
