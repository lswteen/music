package com.renzo.music.domain.product.repository;

import com.renzo.music.domain.product.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, String> {

    Product findById(Long id);

    //List<Product> findAllById(List<Long> ids);
}
