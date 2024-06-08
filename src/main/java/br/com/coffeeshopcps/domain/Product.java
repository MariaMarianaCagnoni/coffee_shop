package br.com.coffeeshopcps.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;


@Entity
@Table(name = "product")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Product {

    @Id
    @Column(name = "id")
    private Long id;

    @NotEmpty(message = "product name field can't be empty")
    @Column(name = "name")
    private String name;

    @NotEmpty(message = "product description field can't be empty")
    @Column(name = "description")
    private String description;

    @Column(name = "image")
    private String image;

    @NotEmpty(message = "expiration date field can't be empty")
    @Column(name = "expiration_date")
    private LocalDate expirationDate;

    @NotEmpty(message = "quantity field can't be empty")
    @Column(name = "quantity")
    private Integer quantity;

    @NotEmpty(message = "price field can't be empty")
    @Column(name = "price", precision = 10, scale = 2)
    private BigDecimal price;

    @ManyToOne
    @ToString.Exclude
    private Order order;

}
