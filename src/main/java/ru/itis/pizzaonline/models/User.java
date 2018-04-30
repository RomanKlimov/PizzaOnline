package ru.itis.pizzaonline.models;

import lombok.*;
import ru.itis.pizzaonline.security.Role.Role;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;

@Getter
@Setter
@Entity
@Table(name = "users")
@AllArgsConstructor
@Builder
@ToString
@EqualsAndHashCode
@NoArgsConstructor
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @NotNull
    @Email
    @Column(name = "email", unique = true)
    private String email;

    @NotNull
    @Column(name = "phoneNumber", unique = true)
    private String phoneNumber;

    @Column(name = "hashPassword")
    private String hashPassword;

    private String imageUrl;

    @Enumerated(EnumType.STRING)
    private Role role;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Order> orders;


}
