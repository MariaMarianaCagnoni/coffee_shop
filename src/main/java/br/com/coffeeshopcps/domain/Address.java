package br.com.coffeeshopcps.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
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

    @NotEmpty(message = "City can't be empty")
    @Column(name = "city", nullable = false)
    private String city;

    @NotEmpty(message = "Street can't be empty")
    @Column(name = "street", nullable = false)
    private String street;

    @NotEmpty(message = "House number can't be empty")
    @Column(name = "house_number", nullable = false)
    private String houseNumber;

    @Column(name = "zip_code", nullable = false)
    private String zipCode;

    @OneToOne
    @JoinColumn(name = "client_id")
    private Client client;

    @OneToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

}
