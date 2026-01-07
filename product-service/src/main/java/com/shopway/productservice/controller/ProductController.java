package com.shopway.productservice.controller;

import com.shopway.productservice.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/shopway/products")
@AllArgsConstructor
public class ProductController {
    private final ProductService productService;
}
