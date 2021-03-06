package ru.itis.pizzaonline.services.implementations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.itis.pizzaonline.models.Order;
import ru.itis.pizzaonline.models.User;
import ru.itis.pizzaonline.repositories.OrderRepository;
import ru.itis.pizzaonline.services.interfaces.OrderService;

import java.util.List;
import java.util.Optional;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public List<Order> getAllOrders() {
        return orderRepository.findAllByIsActiveTrue();
    }

    @Override
    public void addOrder(Order order) {
        orderRepository.save(order);
    }

    @Override
    public Optional<Order> getOrderById(Long id){
      return orderRepository.findFirstById(id);
    }

    @Override
    public List<Order> getAllOrderAcceptedUser(User courier){
       return orderRepository.findAllByCourierAndCompletedFalse(courier);
    }

    @Override
    public List<Order> getCompletedOrders(User courier) {
        return orderRepository.findAllByCourierAndCompletedTrue(courier);
    }
}
