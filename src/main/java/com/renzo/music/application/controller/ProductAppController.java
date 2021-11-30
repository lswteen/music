package com.renzo.music.application.controller;

import com.renzo.music.application.request.ProductRequest;
import com.renzo.music.application.response.ProductResponse;
import com.renzo.music.application.service.ProductAppService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ResponseHeader;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.renzo.music.application.response.ResponseConstants.OK;

@RestController
@RequestMapping("/api/v1/products")
@Api(value="/api/v1/products", tags ="PRODUCT API")
@AllArgsConstructor
public class ProductAppController {

    private final ProductAppService productAppService;

    @ApiOperation(value="상품 리스트",
        produces = MediaType.APPLICATION_JSON_VALUE,
        responseHeaders = {
                @ResponseHeader(name = HttpHeaders.CONTENT_TYPE, description = MediaType.APPLICATION_JSON_VALUE)
        })
    @GetMapping
    @Transactional
    public List<ProductResponse> getAllByProducts(@RequestParam(required = true) List<Long> ids){
        return productAppService.getAllByProducts(ids);
    }

    @ApiOperation(value="상품 등록",
            produces = MediaType.APPLICATION_JSON_VALUE,
            responseHeaders = {
                    @ResponseHeader(name = HttpHeaders.CONTENT_TYPE, description = MediaType.APPLICATION_JSON_VALUE)
            })
    @PostMapping
    @Transactional
    public List<ProductResponse> save(@RequestBody List<ProductRequest> productRequests){
        return productAppService.save(productRequests);
    }

    @ApiOperation(value="상품 수정",
            produces = MediaType.APPLICATION_JSON_VALUE,
            responseHeaders = {
                    @ResponseHeader(name = HttpHeaders.CONTENT_TYPE, description = MediaType.APPLICATION_JSON_VALUE)
            })
    @PutMapping
    @Transactional
    public List<ProductResponse> update(@RequestBody List<ProductRequest> productRequests){
        return productAppService.update(productRequests);
    }

    @ApiOperation(value="상품 삭제",
            produces = MediaType.APPLICATION_JSON_VALUE,
            responseHeaders = {
                    @ResponseHeader(name = HttpHeaders.CONTENT_TYPE, description = MediaType.APPLICATION_JSON_VALUE)
            })
    @DeleteMapping
    @Transactional
    public ResponseEntity<Void> delete(@RequestParam(required = true) Long productId){
        productAppService.delete(productId);
        return OK;
    }

}
