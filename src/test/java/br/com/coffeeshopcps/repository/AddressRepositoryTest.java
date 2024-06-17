package br.com.coffeeshopcps.repository;

import br.com.coffeeshopcps.domain.Address;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;


@DataJpaTest
@DisplayName("Tests for Address Repository")
class AddressRepositoryTest {

    @Autowired
    private AddressRepository addressRepository;


    @Test
    @DisplayName("Save persists an address when successful")
    void savePersistenceAddressWhenSuccessful() {
        Address addressToBeSaved = createAddress();
        Address saveAddress = this.addressRepository.save(addressToBeSaved);
        Assertions.assertThat(saveAddress).isNotNull();
        Assertions.assertThat(saveAddress.getId()).isNotNull();
    }


    @Test
    @DisplayName("Find by id returns an address when successful")
    void findByIdReturnsAddressWhenSuccessful() {
        Address addressToBeSaved = createAddress();
        Address saveAddress = this.addressRepository.save(addressToBeSaved);
        Assertions.assertThat(this.addressRepository.findById(saveAddress.getId())).isPresent();
    }


    //TODO: Add tests for findAllByClientId
    //TODO: Add tests for deleteAllByClientId
    //TODO: Add tests for deleteAllByEmployeeId

    @Test
    @DisplayName("Save updates all new address fields  when successful")
    void updateAddressWhenSuccessful() {
        Address addressToBeSaved = createAddress();
        Address saveAddress = this.addressRepository.save(addressToBeSaved);

        saveAddress.setCity("New City");
        saveAddress.setStreet("New Street");
        saveAddress.setHouseNumber("New House Number 12345");
        saveAddress.setZipCode("New Zip Code");

        Address addressUpdated = this.addressRepository.save(saveAddress);
        Assertions.assertThat(addressUpdated).isNotNull();
        Assertions.assertThat(addressUpdated.getId()).isNotNull();
        Assertions.assertThat(addressUpdated.getCity()).isEqualTo(saveAddress.getCity());
        Assertions.assertThat(addressUpdated.getStreet()).isEqualTo(saveAddress.getStreet());
        Assertions.assertThat(addressUpdated.getHouseNumber()).isEqualTo(saveAddress.getHouseNumber());
        Assertions.assertThat(addressUpdated.getZipCode()).isEqualTo(saveAddress.getZipCode());

    }

    @Test
    @DisplayName("Delete removes an address when successful")
    void deleteRemovesAddressWhenSuccessful() {

        Address addressToBeSaved = createAddress();
        Address saveAddress = this.addressRepository.save(addressToBeSaved);
        this.addressRepository.delete(saveAddress);
        Assertions.assertThat(this.addressRepository.findById(saveAddress.getId())).isEmpty();
    }


    private Address createAddress() {
        return new Address(1L, "City", "Street", "House number", "Zip code", null, null);
    }

}