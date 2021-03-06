package ru.itis.pizzaonline.forms;

import lombok.Getter;
import lombok.Setter;
import ru.itis.pizzaonline.security.Role.Role;

import javax.persistence.*;

@Setter
@Getter
@Entity
public class UserRegistrationForm {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "phoneNumber")
    private String phoneNumber;

    @Column(name = "role")
    private Role role;
}
