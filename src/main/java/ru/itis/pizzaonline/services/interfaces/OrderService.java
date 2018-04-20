package ru.itis.pizzaonline.services.interfaces;

import ru.itis.pizzaonline.models.Order;
import ru.itis.pizzaonline.models.User;

import java.util.List;
import java.util.Optional;

/**
 * Date 20.04.2018
 *
 * @author Hursanov Sulaymon
 * @version v1.0
 **/
public interface OrderService {
    List<Order> getAllOrders();
    void addOrder(Order order);

    Optional<Order> getOrderById(Long id);

    List<Order> getAllOrderAcceptedUser(User courier);

    List<Order> getCompletedOrders(User courier);
}
