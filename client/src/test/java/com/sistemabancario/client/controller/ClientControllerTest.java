package com.sistemabancario.client.controller;

import static org.mockito.Mockito.when;

import com.sistemabancario.client.domain.Client;
import com.sistemabancario.client.service.IClientService;
import com.sistemabancario.client.service.impl.ClientService;
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
    IClientService clientService;
    List<Client> lclient;
    Client client;

    static String ID = "1111111";


    @BeforeEach
    public void setUp(){
        lclient = new ArrayList<>();
        client =  new Client("sss","1111","2222","4444","55555","66666","77777","88888");
        lclient.add(client);

        client=  new Client("sss","1111","2222","4444","55555","66666","77777","88888");
        lclient.add(client);


    }

    @Test
    void testFindAll() {
        when(clientService.findAll()).thenReturn(Flux.fromIterable(lclient));
        Flux<Client> responseBody = webTestClient.get()
                .uri("/client")
                .exchange()
                .expectStatus().isOk()
                .returnResult(Client.class)
                .getResponseBody();

        StepVerifier.create(responseBody)
                .expectSubscription()
                .expectNext(new Client("sss","1111","2222","4444","55555","66666","77777","88888"))
                .expectNext(new Client("sss","1111","2222","4444","55555","66666","77777","88888"))
                .verifyComplete();
    }
}