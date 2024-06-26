package br.com.coffeeshopcps.dto;

import br.com.coffeeshopcps.domain.Address;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class CreateEmployeeDTO {

    private Long id;
    private String name;
    private String cpf;
    private BigDecimal salary;
    private String bankAccount;
    private String phone;
    private Address address;

}
