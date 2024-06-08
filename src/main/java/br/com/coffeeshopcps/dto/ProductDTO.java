package br.com.coffeeshopcps.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProductDTO {
    private Long id;
    private String name;
    private String description;
    private String image;
    private Integer quantity;
    private BigDecimal price;

}
