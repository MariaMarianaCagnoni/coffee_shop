package br.com.coffeeshopcps.dto;

import lombok.Data;

@Data
public class ClientDTO {

    private Long id;
    private String name;
    private String email;
    private String phone;
    private String cpf;
    private AddressDTO address;
}
