package br.com.coffeeshopcps.domain;

import jakarta.persistence.*;
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
public class Product implements BaseModel<Product> {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "image")
    private String image;

    @Column(name = "expiration_date")
    private LocalDate expirationDate;

    @Column(name = "quantity")
    private Integer quantity;

    @Column(name = "price")
    private BigDecimal price;

    @ManyToOne
    @ToString.Exclude
    private Order order;

    @Column(name = "data_cadastro")
    private LocalDateTime createdAt;

    @Override
    public Product safeUpdateInfo(Product product) {
        this.setName(product.getName());
        this.setDescription(product.getDescription());
        this.setImage(product.getImage());
        this.setExpirationDate(product.getExpirationDate());
        this.setQuantity(product.getQuantity());
        this.setPrice(product.getPrice());
        this.setOrder(product.getOrder());
        return this;
    }
}
