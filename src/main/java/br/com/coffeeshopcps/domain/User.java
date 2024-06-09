package br.com.coffeeshopcps.domain;


import br.com.coffeeshopcps.validators.Password;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Email
    @Column(name = "user_name",unique = true)
    private String userNameEmail;

    @Password
    @Column(name = "password")
    private String password;

}
