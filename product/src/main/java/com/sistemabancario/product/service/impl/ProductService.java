package com.sistemabancario.product.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sistemabancario.product.domain.Product;
import com.sistemabancario.product.repository.IProductRepository;
import com.sistemabancario.product.service.IProductService;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class ProductService implements IProductService {

	@Autowired
	private final IProductRepository iproductRepository;
	
	@Override
	public Flux<Product> findAll() {
		return iproductRepository.findAll();
	}

	@Override
	public Mono<Product> findById(String id) { 
		return iproductRepository.findById(id);
	}

	@Override
	public Mono<Product> save(Product product) {
		return iproductRepository.save(product);
	}

	@Override
	public Mono<Product> update(Product product) {
		return iproductRepository.save(product);
	}

	@Override
	public Mono<Void> deleteById(String id) {
		return iproductRepository.deleteById(id);
	}
}
