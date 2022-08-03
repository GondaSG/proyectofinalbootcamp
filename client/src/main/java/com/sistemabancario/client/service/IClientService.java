package com.sistemabancario.client.service;

import com.sistemabancario.client.domain.Client;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IClientService {
    Flux<Client> findAll();

    Mono<Client> findById(String id);

    Mono<Client> save(Client client);

    Mono<Client> update(Client client);

    Mono<Void> deleteById(String id);

    Flux<Client> findByDocument(String document);
}
