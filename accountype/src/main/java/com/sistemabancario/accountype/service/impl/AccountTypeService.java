package com.sistemabancario.accountype.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sistemabancario.accountype.domain.AccountType;
import com.sistemabancario.accountype.repository.IAccountTypeRepository;
import com.sistemabancario.accountype.service.IAccountTypeService;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class AccountTypeService implements IAccountTypeService {
    @Autowired
    private IAccountTypeRepository iaccountTypeRepository;
    @Override
    public Flux<AccountType> findAll() {
        return iaccountTypeRepository.findAll();
    }

    @Override
    public Mono<AccountType> findById(String id) {
        return iaccountTypeRepository.findById(id);
    }

    @Override
    public Mono<AccountType> save(AccountType accountType) {
        return iaccountTypeRepository.save(accountType);
    }

    @Override
    public Mono<AccountType> update(AccountType accountType) {
        return iaccountTypeRepository.save(accountType);
    }

    @Override
    public Mono<Void> deleteById(String id) {
        return iaccountTypeRepository.deleteById(id);
    }
}
