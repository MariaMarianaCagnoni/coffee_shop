package br.com.coffeeshopcps.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class EmployeeDTO {

    private Long id;
    private String name;
    private String cpf;
    private BigDecimal salary;
    private String bankAccount;
    private String phone;
    private AddressDTO address;
}
