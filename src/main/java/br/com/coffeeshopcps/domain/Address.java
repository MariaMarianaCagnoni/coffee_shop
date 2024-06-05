package br.com.coffeeshopcps.domain;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "address")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "city",nullable = false)
    private String city;

    @Column(name = "street",nullable = false)
    private String street;

    @Column(name = "house_number")
    private String houseNumber;

    @Column(name = "zip_code",nullable = false)
    private String zipCode;

    @OneToOne
    @JoinColumn(name = "client_id")
    private Client client;

    @OneToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

}
