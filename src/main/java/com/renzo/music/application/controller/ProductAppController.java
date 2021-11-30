package com.renzo.music.application.controller;

import com.renzo.music.application.request.ProductRequest;
import com.renzo.music.application.response.ProductResponse;
import com.renzo.music.application.service.ProductAppService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class ProductAppController {

    private final ProductAppService productAppService;

    public List<ProductResponse> getAllByProducts(ProductRequest productRequest){
        return null;
    }

    public List<ProductResponse> save(@RequestBody List<ProductRequest> productRequests){
        return null;
    }

    public ProductResponse update(){
        return null;
    }

    public ProductResponse delete(){
        return null;
    }

}
