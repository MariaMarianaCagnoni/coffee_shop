package br.com.coffeeshopcps.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class CreateProductDTO {

    private String id;
    private String image;
    private String name;
    private String description;
    private BigDecimal price;
}
