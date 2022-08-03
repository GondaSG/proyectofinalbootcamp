package com.sistemabancario.operationtype.service;

import com.sistemabancario.operationtype.domain.OperationType;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IOperationTypeService {
	Flux<OperationType> findAll();
	
	Mono<OperationType> findById(String id);

    Mono<OperationType> save(OperationType operationType);

    Mono<OperationType> update(OperationType operationType);
    
    public Mono<Void> deleteById(String id);
}
