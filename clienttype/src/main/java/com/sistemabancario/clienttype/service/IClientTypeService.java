package com.sistemabancario.clienttype.service;

import com.sistemabancario.clienttype.domain.ClientType;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IClientTypeService {
    Flux<ClientType> findAll();

    Mono<ClientType> findById(String id);

    Mono<ClientType> save(ClientType clientType);

    Mono<ClientType> update(ClientType clientType);

    Mono<Void> deleteById(String id);

}
