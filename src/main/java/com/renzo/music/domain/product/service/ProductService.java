package com.renzo.music.domain.product.service;

import com.renzo.music.domain.product.entity.Product;
import com.renzo.music.domain.product.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    public Product getById(Long id){
        return productRepository.findById(id);
    }

}
