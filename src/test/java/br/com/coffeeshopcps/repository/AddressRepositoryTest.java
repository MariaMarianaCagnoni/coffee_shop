package br.com.coffeeshopcps.repository;

import br.com.coffeeshopcps.domain.Address;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
@DisplayName("Tests for Address Repository")
public class AddressRepositoryTest {


    @Autowired
    private AddressRepository addressRepository;


    @Test
    @DisplayName("Save creates an address when successful")
    public void savePersistenceAddressWhenSuccessful() {
        Address addressToBeSaved = createAddress();
        Address saveAddress = this.addressRepository.save(addressToBeSaved);
        Assertions.assertThat(saveAddress).isNotNull().;
        Assertions.assertThat(saveAddress.getId()).isNotNull();

    }

    private Address createAddress() {
        return new Address(1L, "City", "Street", "House number", "Zip code", null, null);
    }

}