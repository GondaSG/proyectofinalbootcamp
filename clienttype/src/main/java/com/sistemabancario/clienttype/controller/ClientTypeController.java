package com.sistemabancario.clienttype.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sistemabancario.clienttype.domain.ClientType;
import com.sistemabancario.clienttype.service.IClientTypeService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/clienttype")
public class ClientTypeController {

    @Autowired
    private IClientTypeService clientTypeService;

    @GetMapping
    public Flux<ClientType> findAll(){
        return clientTypeService.findAll();
    }

    @GetMapping("/{id}")
    public Mono<ClientType> getById(@PathVariable("id") String id){return  clientTypeService.findById(id);
    }

    @PostMapping
    public Mono<ClientType> create(@RequestBody ClientType clientType){
        return clientTypeService.save(clientType);
    }

    @PutMapping
    public Mono<ClientType> update(@RequestBody ClientType clientType){
        return clientTypeService.update(clientType);
    }

    @DeleteMapping
    public Mono<Void> deleteById(@PathVariable("id") String id){
        return clientTypeService.deleteById(id);
    }
}
