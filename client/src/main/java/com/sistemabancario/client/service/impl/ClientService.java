package com.sistemabancario.client.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sistemabancario.client.domain.Client;
import com.sistemabancario.client.repository.IClientRepository;
import com.sistemabancario.client.service.IClientService;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class ClientService implements IClientService {

    @Autowired
    private IClientRepository clientRepository;
    @Override
    public Flux<Client> findAll() {
        return clientRepository.findAll();
    }

    @Override
    public Mono<Client> findById(String id) {
        return clientRepository.findById(id);
    }

    @Override
    public Mono<Client> save(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public Mono<Client> update(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public Mono<Void> deleteById(String id) {
        return clientRepository.deleteById(id);
    }

    @Override
    public Flux<Client> findByDocument(String document) {
        return clientRepository.findAll().filter(x->x.getDocumentNumber().equals(document));
    }
}
