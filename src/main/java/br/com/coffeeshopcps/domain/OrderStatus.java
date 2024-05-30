package br.com.coffeeshopcps.domain;

public enum OrderStatus {


    NEW("new"),
    PROCESSING("processing"),
    SHIPPED("shipped"),
    DELIVERED("delivered"),
    CANCELLED("cancelled");

    private final String status;

    OrderStatus(String status) {
        this.status = status;
    }
}
