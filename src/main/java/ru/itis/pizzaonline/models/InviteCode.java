package ru.itis.pizzaonline.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Date 20.04.2018
 *
 * @author Hursanov Sulaymon
 * @version v1.0
 **/
@Entity
@Getter
@Setter
public class InviteCode {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String code;

    private String forName;

    public InviteCode(String code, String forName) {
        this.code = code;
        this.forName = forName;
    }
}
