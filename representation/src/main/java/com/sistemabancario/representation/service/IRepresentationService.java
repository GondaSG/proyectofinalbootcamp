package com.sistemabancario.representation.service;

import com.sistemabancario.representation.domain.Representation;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IRepresentationService {

    Flux<Representation> findAll();

    Mono<Representation> findById(String id);

    Mono<Representation> save(Representation representation);

    Mono<Representation> update(Representation representation);

    public Mono<Void> deleteById(String id);
}
