package br.com.coffeeshopcps.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.*;
import org.hibernate.validator.constraints.br.CPF;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "client")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Client {

    @Id
    @Column(name = "id")
    private Long id;

    @NotEmpty(message = "name cannot be empty or null")
    @Column(name = "name", nullable = false)
    private String name;

    @CPF(message = "Cpf is not valid")
    @Column(name = "cpf", unique = true)
    private String cpf;

    @Email(message = "Email is not valid")
    @Column(name = "email", unique = true)
    private String email;

    @Pattern(regexp = "^\\([1-9]{2}\\) (?:[2-8]|9[0-9])[0-9]{3}\\-[0-9]{4}$\n", message = "Phone number is not valid")
    @Column(name = "phone", nullable = false)
    private String phone;

    @OneToOne
    @JoinColumn(name = "address_id", nullable = false)
    private Address address;

    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL)
    private List<Order> orders;

}
