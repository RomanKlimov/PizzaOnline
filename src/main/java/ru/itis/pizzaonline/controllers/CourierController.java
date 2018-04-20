package ru.itis.pizzaonline.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.itis.pizzaonline.models.Order;
import ru.itis.pizzaonline.models.User;
import ru.itis.pizzaonline.services.interfaces.OrderService;

import java.util.List;
import java.util.Optional;

/**
 * Date 20.04.2018
 *
 * @author Hursanov Sulaymon
 * @version v1.0
 **/

@Controller
@RequestMapping("/courier")
public class CourierController {

    @Autowired
    private OrderService orderService;


    @GetMapping("/orders")
    public String getOrdersPage(ModelMap modelMap){
        List<Order> orderList = orderService.getAllOrders();
        modelMap.addAttribute("orders", orderList);
        return "courier/orders";
    }

    @PostMapping("/acceptOrder")
    public String acceptOrder(@RequestParam(value = "orderId", required = true) Long orderId){
        User user = null; // will be taken from authentication
        Optional<Order> orderOptional = orderService.getOrderById(orderId);
        if (orderOptional.isPresent()){
            Order order = orderOptional.get();
            order.setIsActive(false);
            order.setCourier(user);
        }
        return "redirect:/orders";
    }


    @GetMapping("/myClients")
    public String getMyClientsPage(ModelMap modelMap){
        User courier = null; // will be taken from authentication
        List<Order> orderList = orderService.getAllOrderAcceptedUser(courier);
        modelMap.addAttribute("orders", orderList);
        return "courier/courierClients";
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
