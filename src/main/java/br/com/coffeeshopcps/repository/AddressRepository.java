package br.com.coffeeshopcps.repository;

import br.com.coffeeshopcps.domain.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {
    List<Address> findAllByClientId(Long clientId);

    void deleteAllByClientId(Long clientId);

    void deleteAllByEmployeeId(Long employeeId);

}
