package br.com.coffeeshopcps.dto;


import lombok.Data;

@Data
public class AddressDTO {
    private Long id;
    private String city;
    private String street;
    private String houseNumber;
    private String zipCode;
    private ClientDTO client;
    private EmployeeDTO employee;
}
