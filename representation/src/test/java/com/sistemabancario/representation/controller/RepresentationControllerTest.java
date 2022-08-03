package com.sistemabancario.representation.controller;

import com.sistemabancario.representation.domain.Representation;
import com.sistemabancario.representation.service.IRepresentationService;
import com.sistemabancario.representation.service.impl.RepresentationService;
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

public class RepresentationControllerTest {

    @Autowired
    WebTestClient webTestClient;

    @MockBean
    IRepresentationService representationService;
    List<Representation> lRepresentation;
    Representation representation;

    static String ID = "1111111";


    @BeforeEach
    public void setUp() {
        lRepresentation = new ArrayList<>();
        representation = new Representation("11111", "1234", "1111", "123333", "111");
        lRepresentation.add(representation);

        representation = new Representation("11111", "1234", "1111", "123333", "111");
        lRepresentation.add(representation);


    }

    @Test
    void testFindAll() {
        /*when(representationService.findAll()).thenReturn(Flux.fromIterable(lRepresentation));
        Flux<Representation> responseBody = webTestClient.get()
                .uri("/representation")
                .exchange()
                .expectStatus().isOk()
                .returnResult(Representation.class)
                .getResponseBody();

        StepVerifier.create(responseBody)
                .expectSubscription()
                .expectNext(new Representation("11111", "1234", "1111", "123333", "111"))
                .expectNext(new Representation("11111", "1234", "1111", "123333", "111"))
                .verifyComplete();*/
    }
}
