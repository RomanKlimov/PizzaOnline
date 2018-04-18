package ru.itis.pizzaonline.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itis.pizzaonline.models.User;
import ru.itis.pizzaonline.security.Role.Role;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findFirstByEmail(String email);

    List<User> findAllByRole(Role role);

    User deleteByEmail(String email);

}
