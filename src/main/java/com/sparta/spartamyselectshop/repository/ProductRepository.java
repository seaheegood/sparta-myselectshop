package com.sparta.spartamyselectshop.repository;

import com.sparta.spartamyselectshop.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
