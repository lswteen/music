package com.renzo.music.application.service;

import com.renzo.music.application.request.ProductRequest;
import com.renzo.music.application.response.ProductResponse;
import com.renzo.music.domain.product.entity.Product;
import com.renzo.music.domain.product.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
@AllArgsConstructor
public class ProductAppService {
    private final ProductService productService;

    public List<ProductResponse> createProduct(List<ProductRequest> productRequests){
        List<ProductResponse> productResponses = new ArrayList<>();

        productRequests.forEach(productRequest -> {
            Product product = Product.createProductBuilder()
                    .name(productRequest.getName())
                    .price(productRequest.getPrice())
                    .build();
            Product newProduct = productService.save(product);
            productResponses.add(ProductResponse.builder()
                .id(newProduct.getId())
                .name(newProduct.getName())
                .price(newProduct.getPrice())
                .build()
            );
        });
        return productResponses;
    }

}
