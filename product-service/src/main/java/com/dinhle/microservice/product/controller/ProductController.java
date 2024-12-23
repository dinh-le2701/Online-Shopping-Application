package com.dinhle.microservice.product.controller;

import com.dinhle.microservice.product.dto.req.ProductRequest;
import com.dinhle.microservice.product.dto.response.ProductResponse;
import com.dinhle.microservice.product.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
@AllArgsConstructor
public class ProductController {
    private final ProductService productService;

    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    public ProductResponse createProduct(@RequestBody ProductRequest productRequest){
        return productService.createProduct(productRequest);
    }

    @GetMapping("")
    @ResponseStatus(HttpStatus.OK)
    public List<ProductResponse> getProducts(){
        return productService.getAllProducts();
    }
}
