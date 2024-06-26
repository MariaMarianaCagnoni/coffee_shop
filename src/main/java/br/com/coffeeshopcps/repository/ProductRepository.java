package br.com.coffeeshopcps.repository;

import br.com.coffeeshopcps.domain.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findAllByName(String name);

    Page<Product> findAllByName(String name, Pageable pageable);

}
