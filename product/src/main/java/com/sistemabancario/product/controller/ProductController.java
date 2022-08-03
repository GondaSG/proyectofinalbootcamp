package com.sistemabancario.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sistemabancario.product.domain.Product;
import com.sistemabancario.product.service.IProductService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private IProductService iProductService;

    @GetMapping
    public Flux<Product> getAll(){
        return iProductService.findAll();
    }

    @GetMapping("/{id}")
    public Mono<Product> getById(@PathVariable("id") String id){
        return  iProductService.findById(id);
    }

    @PostMapping
    public Mono<Product> create(@RequestBody Product product){
        return iProductService.save(product);
    }

    @PutMapping
    public Mono<Product> update(@RequestBody Product product){
        return iProductService.update(product);
    }

    @DeleteMapping
    public Mono<Void> deleteById(@PathVariable("id") String id){
        return iProductService.deleteById(id);
    }
}
