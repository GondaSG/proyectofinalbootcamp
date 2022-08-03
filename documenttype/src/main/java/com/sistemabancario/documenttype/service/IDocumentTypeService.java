package com.sistemabancario.documenttype.service;

import com.sistemabancario.documenttype.domain.DocumentType;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IDocumentTypeService {

    abstract Flux<DocumentType> findAll();

	Mono<DocumentType> findById(String id);

    Mono<DocumentType> save(DocumentType documentType);

    Mono<DocumentType> update(DocumentType documentType);
    
    public Mono<Void> deleteById(String id);
}
