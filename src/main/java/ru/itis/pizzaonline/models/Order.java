package ru.itis.pizzaonline.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Date 20.04.2018
 *
 * @author Hursanov Sulaymon
 * @version v1.0
 **/
@Entity
@Getter
@Setter
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String address;
    private Long countOfPizzas;
    private Long price;
    private String clientName;
    @Column(columnDefinition = "boolean default true")
    private Boolean isActive;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "courier_id", referencedColumnName = "id")
    private User courier;
    private Boolean completed;
}
