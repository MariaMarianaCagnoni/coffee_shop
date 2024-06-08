package br.com.coffeeshopcps.controller;


import br.com.coffeeshopcps.domain.Product;
import br.com.coffeeshopcps.dto.ProductDTO;
import br.com.coffeeshopcps.service.ProductService;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final ProductService productService;
    private final ModelMapper modelMapper;

    public ProductController(ProductService productService, ModelMapper modelMapper) {
        this.productService = productService;
        this.modelMapper = modelMapper;
    }




    @GetMapping("/{id}")
    public ResponseEntity<ProductDTO> findById(@PathVariable Long id) {
        var aluno = this.productService.findById(id);
        return new ResponseEntity<>(this.modelMapper.map(aluno, ProductDTO.class), HttpStatus.OK);
    }

}
