package com.renzo.music.domain.product.service;

import com.renzo.music.core.exception.ApiException;
import com.renzo.music.core.type.ServiceErrorType;
import com.renzo.music.domain.product.entity.Product;
import com.renzo.music.domain.product.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
@AllArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public List<Product> getAllByProducts(List<Long> ids){
        return productRepository.findAllById(ids);
    }

    @Transactional
    public Product save(Product product){
        return productRepository.save(product);
    }

    @Transactional(readOnly = true)
    public Product getById(Long productId){
        return productRepository.findById(productId)
                .orElseThrow(() -> new ApiException(ServiceErrorType.NOT_FOUND));
    }

    @Transactional
    public void deleteByProductId(Long productId){
        productRepository.deleteById(productId);
    }

}
