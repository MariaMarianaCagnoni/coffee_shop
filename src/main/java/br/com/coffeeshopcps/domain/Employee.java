package br.com.coffeeshopcps.domain;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Table(name = "employee")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name",nullable = false)
    private String name;

    @Column(name = "cpf",nullable = false,unique = true)
    private String cpf;

    @Column(name = "salary",nullable = false)
    private BigDecimal salary;

    @Column(name = "bank_account",nullable = false)
    private String bankAccount;

    @Column(name = "cell_phone",nullable = false)
    private String cellPhone;

    @OneToOne
    @JoinColumn(name = "address_id",nullable = false)
    private Address address;

}
