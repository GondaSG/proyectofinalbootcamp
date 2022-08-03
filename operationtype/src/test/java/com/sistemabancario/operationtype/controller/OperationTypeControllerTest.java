package com.sistemabancario.operationtype.controller;

import static org.mockito.Mockito.when;

import com.sistemabancario.operationtype.domain.OperationType;
import com.sistemabancario.operationtype.service.IOperationTypeService;
import com.sistemabancario.operationtype.service.impl.OperationTypeService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.reactive.server.WebTestClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import reactor.test.StepVerifier;

@WebFluxTest
class OperationTypeControllerTest {
    @Autowired
    WebTestClient webTestClient;

    @MockBean
    IOperationTypeService operationTypeService;
    List<OperationType> lOperationType;
    OperationType operationType;

    static String ID = "1111111";


    @BeforeEach
    public void setUp(){
        lOperationType = new ArrayList<>();
        operationType =  new OperationType("11111","33333",1111.00,"123333","111","59");
        lOperationType.add(operationType);

        operationType=  new OperationType("11111","33333",1111.00,"123333","111","59");
        lOperationType.add(operationType);


    }

    @Test
    void testFindAll() {
        when(operationTypeService.findAll()).thenReturn(Flux.fromIterable(lOperationType));
        Flux<OperationType> responseBody = webTestClient.get()
                .uri("/operationtype")
                .exchange()
                .expectStatus().isOk()
                .returnResult(OperationType.class)
                .getResponseBody();

        StepVerifier.create(responseBody)
                .expectSubscription()
                .expectNext(new OperationType("11111","33333",1111.00,"123333","111","59"))
                .expectNext(new OperationType("11111","33333",1111.00,"123333","111","59"))
                .verifyComplete();
    }
}