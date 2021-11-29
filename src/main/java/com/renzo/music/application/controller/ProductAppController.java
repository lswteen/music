package com.renzo.music.application.controller;

import com.renzo.music.application.request.ProductRequest;
import com.renzo.music.application.response.ProductResponse;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductAppController {

    public List<ProductResponse> getProducts(ProductRequest productRequest){
        return null;
    }

    public List<ProductResponse> createProducts(@RequestBody List<ProductRequest> productRequests){
        return null;
    }

    public ProductResponse updateproduct(){
        return null;
    }

    public ProductResponse deleteProduct(){
        return null;
    }

}
