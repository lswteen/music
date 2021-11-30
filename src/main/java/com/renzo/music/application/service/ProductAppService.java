package com.renzo.music.application.service;

import com.renzo.music.application.request.ProductRequest;
import com.renzo.music.application.response.ProductResponse;
import com.renzo.music.domain.product.entity.Product;
import com.renzo.music.domain.product.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;


@Service
@AllArgsConstructor
public class ProductAppService {
    private final ProductService productService;

    @Transactional
    public List<ProductResponse> getAllByProducts(List<Long> ids){
        List<Product> products = productService.getAllByProducts(ids);
        List<ProductResponse> productResponses = new ArrayList<>();

        products.forEach(product -> {
            productResponses.add(ProductResponse.builder()
                            .id(product.getId())
                            .name(product.getName())
                            .price(product.getPrice())
                    .build());
        });
        return productResponses;
    }

    @Transactional
    public List<ProductResponse> save(List<ProductRequest> productRequests){
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

    @Transactional
    public List<ProductResponse> update(List<ProductRequest> productRequests){
        List<ProductResponse> productResponses = new ArrayList<>();
        productRequests.forEach(productRequest -> {
            Product product = productService.getById(productRequest.getId());
            product.setName(productRequest.getName());
            product.setPrice(productRequest.getPrice());
            Product updateProduct = productService.save(product);

            productResponses.add(ProductResponse.builder()
                            .id(updateProduct.getId())
                            .name(updateProduct.getName())
                            .price(updateProduct.getPrice())
                    .build());
        });

        return productResponses;
    }

    @Transactional
    public void delete(Long productId){
        Product product = productService.getById(productId);
        productService.deleteByProductId(product.getId());
    }

}
