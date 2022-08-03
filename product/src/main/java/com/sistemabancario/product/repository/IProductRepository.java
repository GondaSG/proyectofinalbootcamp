package com.sistemabancario.product.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.sistemabancario.product.domain.Product;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IProductRepository extends ReactiveCrudRepository<Product,String> {

    List<Product> findByIdCliente(String id);
}
