package com.sistemabancario.product.controller;

import com.sistemabancario.product.domain.Product;
import com.sistemabancario.product.service.IProductService;
import com.sistemabancario.product.service.impl.ProductService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.reactive.server.WebTestClient;
import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

public class ProductControllerTest {

    @Autowired
    WebTestClient webTestClient;

    @MockBean
    IProductService productService;
    List<Product> lProduct;
    Product product;

    static String ID = "1111111";


    @BeforeEach
    public void setUp(){
        lProduct = new ArrayList<>();
        product =  new Product("11111","33333");
        lProduct.add(product);

        product=  new Product("11112","33333");
        lProduct.add(product);


    }

    @Test
    void testFindAll() {
        /*when(productService.findAll()).thenReturn(Flux.fromIterable(lProduct));
        Flux<Product> responseBody = webTestClient.get()
                .uri("/product")
                .exchange()
                .expectStatus().isOk()
                .returnResult(Product.class)
                .getResponseBody();

        StepVerifier.create(responseBody)
                .expectSubscription()
                .expectNext(new Product("11111","33333"))
                .expectNext(new Product("11111","33333"))
                .verifyComplete();*/
    }
}
