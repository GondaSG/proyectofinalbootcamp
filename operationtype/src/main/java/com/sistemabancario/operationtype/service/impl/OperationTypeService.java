package com.sistemabancario.operationtype.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sistemabancario.operationtype.domain.OperationType;
import com.sistemabancario.operationtype.repository.IOperationTypeRepository;
import com.sistemabancario.operationtype.service.IOperationTypeService;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class OperationTypeService implements IOperationTypeService {

	@Autowired
	private final IOperationTypeRepository operationTypeRepository;
	
	@Override
	public Flux<OperationType> findAll() {
		return operationTypeRepository.findAll();
	}

	@Override
	public Mono<OperationType> findById(String id) { 
		return operationTypeRepository.findById(id);
	}

	@Override
	public Mono<OperationType> save(OperationType operationType) {
		return operationTypeRepository.save(operationType);
	}

	@Override
	public Mono<OperationType> update(OperationType operationType) {
		return operationTypeRepository.save(operationType);
	}

	@Override
	public Mono<Void> deleteById(String id) {
		return operationTypeRepository.deleteById(id);
	}
}
