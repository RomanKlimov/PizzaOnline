package ru.itis.pizzaonline.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.itis.pizzaonline.models.Order;
import ru.itis.pizzaonline.models.User;
import ru.itis.pizzaonline.services.interfaces.AuthenticationService;
import ru.itis.pizzaonline.services.interfaces.OrderService;

import java.util.List;
import java.util.Optional;


@Controller
@RequestMapping("/courier")
public class CourierController {

    @Autowired
    private OrderService orderService;

    @Autowired
    private AuthenticationService authenticationService;


    @GetMapping("/orders")
    public String getOrdersPage(ModelMap modelMap){
        List<Order> orderList = orderService.getAllOrders();
        modelMap.addAttribute("orders", orderList);
        return "courier/orders";
    }

    @PostMapping("/acceptOrder")
    public String acceptOrder(@RequestParam(value = "orderId", required = true) Long orderId, Authentication authentication){

        User user = authenticationService.getUserByAuthentication(authentication);
        if (user != null){
            Optional<Order> orderOptional = orderService.getOrderById(orderId);
            if (orderOptional.isPresent()){
                Order order = orderOptional.get();
                order.setIsActive(false);
                order.setCourier(user);//fix
                return "redirect:/orders";
            }

        }
        return "redirect:/";
    }


    @GetMapping("/myClients")
    public String getMyClientsPage(ModelMap modelMap, Authentication authentication) {
        User user = authenticationService.getUserByAuthentication(authentication);
        if (user != null){
            List<Order> orderList = orderService.getAllOrderAcceptedUser(user);
            modelMap.addAttribute("orders", orderList);
            return "courier/courierClients";
            }
        return "redirect:/";
    }

    @PostMapping("/orderComplete")
    public String verifyOrder(@RequestParam("orderId") Long orderId, ModelMap modelMap){
        Optional<Order> orderOptional = orderService.getOrderById(orderId);
        if (orderOptional.isPresent()){
            Order order = orderOptional.get();
            order.setCompleted(true);
        }

        return "redirect:/myClients";
    }

    @GetMapping("completedOrders")
    public String getCompletedOrdersPage(ModelMap modelMap){
        User user = null;
        List<Order> orders = orderService.getCompletedOrders(user);
        modelMap.addAttribute("orders", orders);
        return "courier/completedOrders";

    }

}
