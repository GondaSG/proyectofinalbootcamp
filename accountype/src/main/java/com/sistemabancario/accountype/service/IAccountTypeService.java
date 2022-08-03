package com.sistemabancario.accountype.service;

import com.sistemabancario.accountype.domain.AccountType;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IAccountTypeService {
	 	Flux<AccountType> findAll();

	    Mono<AccountType> findById(String id);

	    Mono<AccountType> save(AccountType accountType);

	    Mono<AccountType> update(AccountType accountType);

	    Mono<Void> deleteById(String id);
}
