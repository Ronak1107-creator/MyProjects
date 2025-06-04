package com.example.product.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.example.product.entity.category;
@Component
public interface CateRepo extends JpaRepository<category,Long> {

}
