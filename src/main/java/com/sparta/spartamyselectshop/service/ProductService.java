package com.sparta.spartamyselectshop.service;

import com.sparta.spartamyselectshop.dto.ProductRequestDto;
import com.sparta.spartamyselectshop.dto.ProductResponseDto;
import com.sparta.spartamyselectshop.entity.Product;
import com.sparta.spartamyselectshop.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public ProductResponseDto createProduct(ProductRequestDto requestDto) {
        Product product = productRepository.save(new Product(requestDto));
        return new ProductResponseDto(product);
    }
}
