package com.sistemabancario.accountype.controller;

import static org.mockito.Mockito.when;

import com.sistemabancario.accountype.domain.AccountType;
import com.sistemabancario.accountype.service.IAccountTypeService;
import com.sistemabancario.accountype.service.impl.AccountTypeService;
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
class AccountTypeControllerTest {
    @Autowired
    WebTestClient webTestClient;

    @MockBean
    IAccountTypeService accountTypeService;
    List<AccountType> lAccount;
    AccountType account;

    static String ID = "1111111";


    @BeforeEach
    public void setUp(){
        lAccount = new ArrayList<>();
        account =  new AccountType("11111","33333",1111.00,123333,"111","59");
        lAccount.add(account);

        account=  new AccountType("11111","33333",1111.00,123333,"111","59");
        lAccount.add(account);


    }

    @Test
    void testFindAll() {
        when(accountTypeService.findAll()).thenReturn(Flux.fromIterable(lAccount));
        Flux<AccountType> responseBody = webTestClient.get()
                .uri("/accounttype")
                .exchange()
                .expectStatus().isOk()
                .returnResult(AccountType.class)
                .getResponseBody();

        StepVerifier.create(responseBody)
                .expectSubscription()
                .expectNext(new AccountType("11111","33333",1111.00,123333,"111","59"))
                .expectNext(new AccountType("11111","33333",1111.00,123333,"111","59"))
                .verifyComplete();
    }
}