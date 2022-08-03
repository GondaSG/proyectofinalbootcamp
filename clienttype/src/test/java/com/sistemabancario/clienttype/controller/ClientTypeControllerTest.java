package com.sistemabancario.clienttype.controller;

import static org.mockito.Mockito.when;

import com.sistemabancario.clienttype.domain.ClientType;
import com.sistemabancario.clienttype.service.IClientTypeService;
import com.sistemabancario.clienttype.service.impl.ClientTypeService;
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
class ClientControllerTest {
    @Autowired
    WebTestClient webTestClient;

    @MockBean
    IClientTypeService clientTypeService;
    List<ClientType> lClientType;
    ClientType clientType;

    static String ID = "1111111";


    @BeforeEach
    public void setUp(){
        lClientType = new ArrayList<>();
        clientType =  new ClientType("sss","1111");
        lClientType.add(clientType);

        clientType=  new ClientType("sss","1111");
        lClientType.add(clientType);


    }

    @Test
    void testFindAll() {
        when(clientTypeService.findAll()).thenReturn(Flux.fromIterable(lClientType));
        Flux<ClientType> responseBody = webTestClient.get()
                .uri("/clienttype")
                .exchange()
                .expectStatus().isOk()
                .returnResult(ClientType.class)
                .getResponseBody();

        StepVerifier.create(responseBody)
                .expectSubscription()
                .expectNext(new ClientType("sss","1111"))
                .expectNext(new ClientType("sss","1111"))
                .verifyComplete();
    }
}