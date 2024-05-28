package br.com.coffeeshopcps.domain;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Product {

    private Long id;
    private String name;
    private String description;
    private String  image;
    private LocalDate expirationDate;
    private Integer  quantity;
    private BigDecimal price;


}
