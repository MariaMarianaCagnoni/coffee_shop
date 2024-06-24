package br.com.coffeeshopcps.repository;

import org.junit.jupiter.api.DisplayName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
@DisplayName("Tests for Employee Repository")
class EmployeeRepositoryTest {

    @Autowired
    private EmployeeRepository employeeRepository;




}