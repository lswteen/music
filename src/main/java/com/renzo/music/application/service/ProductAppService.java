package com.renzo.music.application.service;

import com.renzo.music.application.response.ProductResponse;
import com.renzo.music.domain.product.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
public class ProductAppService {
    private final ProductService productService;

    public ProductResponse createProduct(){
        return null;
    }

}
