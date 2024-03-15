package com.sparta.spartamyselectshop.controller;

import com.sparta.spartamyselectshop.dto.ProductMypriceRequestDto;
import com.sparta.spartamyselectshop.dto.ProductRequestDto;
import com.sparta.spartamyselectshop.dto.ProductResponseDto;
import com.sparta.spartamyselectshop.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class ProductController {

    private final ProductService productService;

    @PostMapping("/products")
    public ProductResponseDto createProduct(@RequestBody ProductRequestDto requestDto) {
        return productService.createProduct(requestDto);
    }

    @PutMapping("/products/{id}")
    public ProductResponseDto updateProduct(@PathVariable Long id, @RequestBody ProductMypriceRequestDto requestDto) {
        return productService.updateProduct(id, requestDto);
    }
}
