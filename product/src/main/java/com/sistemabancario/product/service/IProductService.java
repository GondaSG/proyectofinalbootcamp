package com.sistemabancario.product.service;

import com.sistemabancario.product.domain.Product;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IProductService {
	abstract Flux<Product> findAll();
	
	Mono<Product> findById(String id);

    Mono<Product> save(Product product);

    Mono<Product> update(Product product);
    
    public Mono<Void> deleteById(String id);
}
