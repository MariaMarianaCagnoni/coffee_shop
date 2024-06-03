package br.com.coffeeshopcps.domain;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "client")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Client implements BaseModel<Client> {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "name",nullable = false)
    private String name;

    @Column(name = "cpf",unique = true)
    private String cpf;

    @OneToOne
    @JoinColumn(name = "address_id", nullable = false)
    private Address address;

    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL)
    private List<Order> orders;

    @Column(name = "data_cadastro")
    private LocalDateTime createdAt;

    @Override
    public Client safeUpdateInfo(Client client) {
        this.setName(client.getName());
        this.setAddress(client.getAddress());
        this.setOrders(client.getOrders());
        return this;
    }
}
