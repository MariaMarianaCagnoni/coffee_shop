package br.com.coffeeshopcps.domain;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "employee")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Employee implements BaseModel<Employee>{

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

    @Column(name = "data_cadastro")
    private LocalDateTime createdAt;

    @Override
    public Employee safeUpdateInfo(Employee employee) {
        this.setName(getName());
        this.setCpf(employee.getCpf());
        this.setSalary(employee.getSalary());
        this.setBankAccount(employee.getBankAccount());
        this.setCellPhone(employee.getCellPhone());
        this.setAddress(employee.getAddress());
        return this;
    }
}
