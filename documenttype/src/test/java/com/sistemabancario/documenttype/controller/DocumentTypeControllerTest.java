package com.sistemabancario.documenttype.controller;

import static org.mockito.Mockito.when;

import com.sistemabancario.documenttype.domain.DocumentType;
import com.sistemabancario.documenttype.service.IDocumentTypeService;
import com.sistemabancario.documenttype.service.impl.DocumentTypeService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.reactive.server.WebTestClient;
import reactor.core.publisher.Flux;

import java.util.ArrayList;
import java.util.List;
import reactor.test.StepVerifier;

@WebFluxTest
class DocumentTypeControllerTest {
    @Autowired
    WebTestClient webTestClient;

    @MockBean
    IDocumentTypeService documentTypeService;
    List<DocumentType> lDocumentType;
    DocumentType documentType;

    static String ID = "1111111";


    @BeforeEach
    public void setUp(){
        lDocumentType = new ArrayList<>();
        documentType =  new DocumentType("11111","33333");
        lDocumentType.add(documentType);

        documentType=  new DocumentType("11112","33333");
        lDocumentType.add(documentType);


    }

    @Test
    void testFindAll() {
        when(documentTypeService.findAll()).thenReturn(Flux.fromIterable(lDocumentType));
        Flux<DocumentType> responseBody = webTestClient.get()
                .uri("/documenttype")
                .exchange()
                .expectStatus().isOk()
                .returnResult(DocumentType.class)
                .getResponseBody();

        StepVerifier.create(responseBody)
                .expectSubscription()
                .expectNext(new DocumentType("11111","33333"))
                .expectNext(new DocumentType("11111","33333"))
                .verifyComplete();
    }
}