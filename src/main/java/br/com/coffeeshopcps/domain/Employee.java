package br.com.coffeeshopcps.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;
import org.hibernate.validator.constraints.br.CPF;

import java.math.BigDecimal;
import java.time.LocalDateTime;

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

    @NotEmpty(message = "Name can't be empty or null")
    @Column(name = "name", nullable = false)
    private String name;

    @CPF(message = "Invalid CPF")
    @Column(name = "cpf", nullable = false, unique = true)
    private String cpf;

    @NotEmpty(message = "Salary can't be empty or null")
    @Column(name = "salary", nullable = false)
    private BigDecimal salary;

    @NotEmpty(message = "Bank account can't be empty or null")
    @Column(name = "bank_account", nullable = false)
    private String bankAccount;

    @Column(name = "phone", nullable = false)
    private String phone;

    @OneToOne
    @JoinColumn(name = "address_id", nullable = false)
    private Address address;

}
