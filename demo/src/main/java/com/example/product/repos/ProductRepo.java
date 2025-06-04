package com.example.product.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.example.product.entity.product;
@Component
public interface ProductRepo extends JpaRepository<product,Long> {

}
