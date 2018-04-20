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
    private Long id;

    private String address;
    private Long countOfPizzas;
    private Double price;
    private String clientName;
    @Column(columnDefinition = "boolean default true")
    private Boolean isActive;

    @OneToOne(targetEntity = User.class, mappedBy = "user_id", fetch = FetchType.LAZY)
    private User courier;
    private Boolean completed;
}
