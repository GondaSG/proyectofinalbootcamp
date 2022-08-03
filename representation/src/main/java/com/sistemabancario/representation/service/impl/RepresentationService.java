package com.sistemabancario.representation.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sistemabancario.representation.domain.Representation;
import com.sistemabancario.representation.repository.IRepresentationRepository;
import com.sistemabancario.representation.service.IRepresentationService;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class RepresentationService implements IRepresentationService {

    @Autowired
    private final IRepresentationRepository representationRepository;
    @Override
    public Flux<Representation> findAll() {return representationRepository.findAll();}

    @Override
    public Mono<Representation> findById(String id) {return representationRepository.findById(id);}

    @Override
    public Mono<Representation> save(Representation representation) {return representationRepository.save(representation);}

    @Override
    public Mono<Representation> update(Representation representation) {return representationRepository.save(representation);}

    @Override
    public Mono<Void> deleteById(String id) {return representationRepository.deleteById(id);}
}
