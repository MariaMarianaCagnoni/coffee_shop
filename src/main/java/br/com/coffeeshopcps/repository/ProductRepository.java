package br.com.coffeeshopcps.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<ProductRepository, Long> {

    Page<ProductRepository> findAllByName(String name, Pageable pageable);


}
