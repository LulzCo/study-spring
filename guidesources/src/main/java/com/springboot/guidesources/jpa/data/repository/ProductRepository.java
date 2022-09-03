package com.springboot.guidesources.jpa.data.repository;

import com.springboot.guidesources.jpa.data.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}