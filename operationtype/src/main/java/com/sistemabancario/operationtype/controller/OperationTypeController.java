package com.sistemabancario.operationtype.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sistemabancario.operationtype.domain.OperationType;
import com.sistemabancario.operationtype.service.IOperationTypeService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/operationtype")
public class OperationTypeController {
    @Autowired
    private IOperationTypeService iOperationTypeService;

    @GetMapping
    public Flux<OperationType> getAll(){
        return iOperationTypeService.findAll();
    }

    @GetMapping("/{id}")
    public Mono<OperationType> getById(@PathVariable("id") String id){
        return  iOperationTypeService.findById(id);
    }

    @PostMapping
    public Mono<OperationType> create(@RequestBody OperationType operationType){
        return iOperationTypeService.save(operationType);
    }

    @PutMapping
    public Mono<OperationType> update(@RequestBody OperationType operationType){
        return iOperationTypeService.update(operationType);
    }

    @DeleteMapping
    public Mono<Void> deleteById(@PathVariable("id") String id){
        return iOperationTypeService.deleteById(id);
    }
}
