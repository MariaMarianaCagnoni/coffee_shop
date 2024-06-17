package br.com.coffeeshopcps.service;

import br.com.coffeeshopcps.domain.Product;
import br.com.coffeeshopcps.exception.ProductNotFoundException;
import br.com.coffeeshopcps.repository.ProductRepository;
import jakarta.transaction.Transactional;
import lombok.extern.log4j.Log4j2;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Log4j2
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> findAll() {
        log.info("Finding all products");
        return productRepository.findAll();
    }

    public Page<Product> findAll(Pageable pageable) {
        log.info("Finding all products pageable");
        return productRepository.findAll(pageable);
    }

    public List<Product> findAllByName(String name) {
        if (name == null || name.isEmpty()) {
            log.info(() -> "Name cannot be null or empty");
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        log.info("Finding products by name:{}", name);
        return productRepository.findAllByName(name);
    }

    public Product findById(Long id) {
        log.info("Finding product by id");
        return productRepository.findById(id)
                .orElseThrow(() -> new ProductNotFoundException("Product not found"));
    }

    @Transactional
    public Product saveProduct(Product product) {
        log.info("Saving product: {}", product);
        return productRepository.save(product);
    }

    @Transactional
    public Product updateProduct(Long id, Product product) {
        Product updateById = this.findById(id);
        updateById.setName(product.getName());
        updateById.setDescription(product.getDescription());
        updateById.setImage(product.getImage());
        updateById.setExpirationDate(product.getExpirationDate());
        updateById.setQuantity(product.getQuantity());
        updateById.setPrice(product.getPrice());

        return this.saveProduct(updateById);
    }
}
