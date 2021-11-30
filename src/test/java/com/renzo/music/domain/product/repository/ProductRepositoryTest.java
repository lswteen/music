package com.renzo.music.domain.product.repository;

import com.renzo.music.domain.product.entity.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;



@SpringBootTest
class ProductRepositoryTest {

    @Autowired
    private ProductRepository productRepository;

    @Test
    void save_successe(){
        Product product = Product.createProductBuilder()
                .name("상품A")
                .price(9999)
                .build();
        Product newProduct = productRepository.save(product);
        assertEquals("상품A",newProduct.getName());
        assertEquals(9999,newProduct.getPrice());
    }

//    @Test
//    void find_product(){
//        Product product = Product.createProductBuilder()
//                .name("상품A")
//                .price(9999)
//                .build();
//        Product newProduct = productRepository.save(product);
//
//        Product findProduct = productRepository.getById(newProduct.getId());
//        assertEquals("상품A",findProduct.getName());
//        assertEquals(9999,findProduct.getPrice());
//        assertEquals(1,findProduct.getId());
//
//    }

}