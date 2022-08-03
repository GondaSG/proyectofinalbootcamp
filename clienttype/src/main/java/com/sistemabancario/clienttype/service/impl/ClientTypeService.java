package com.sistemabancario.clienttype.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sistemabancario.clienttype.domain.ClientType;
import com.sistemabancario.clienttype.repository.IClientTypeRepository;
import com.sistemabancario.clienttype.service.IClientTypeService;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class ClientTypeService implements IClientTypeService {
    @Autowired
    private IClientTypeRepository clientTypeRepository;
    @Override
    public Flux<ClientType> findAll() {
        return clientTypeRepository.findAll();
    }

    @Override
    public Mono<ClientType> findById(String id) {
        return clientTypeRepository.findById(id);
    }

    @Override
    public Mono<ClientType> save(ClientType clientType) {
        return clientTypeRepository.save(clientType);
    }

    @Override
    public Mono<ClientType> update(ClientType clientType) {
        return clientTypeRepository.save(clientType);
    }

    @Override
    public Mono<Void> deleteById(String id) {
        return clientTypeRepository.deleteById(id);
    }
}
