package ru.itis.pizzaonline.models;

import lombok.*;

import javax.persistence.*;

/**
 * Date 22.04.2018
 *
 * @author Hursanov Sulaymon
 * @version v1.0
 **/
@Setter
@Getter
@Entity
@Table(name = "pics")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FileInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fileName;
    private String type;
    private String url;
}
