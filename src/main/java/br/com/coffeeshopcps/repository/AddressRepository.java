package br.com.coffeeshopcps.repository;

import br.com.coffeeshopcps.domain.Address;

import br.com.coffeeshopcps.domain.Client;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address,Long> {
    Page<Client> findAllByClientId(Long clientId, Pageable pageable);

    void deleteAllByClientId(Long clientId);
    void deleteAllByEmployeeId(Long employeeId);


}
