package com.sistemabancario.documenttype.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sistemabancario.documenttype.domain.DocumentType;
import com.sistemabancario.documenttype.service.IDocumentTypeService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/documenttype")
public class DocumentTypeController {

    @Autowired
    private IDocumentTypeService iDocumentTypeService;

    @GetMapping
    public Flux<DocumentType> getAll(){
        return iDocumentTypeService.findAll();
    }

    @GetMapping("/{id}")
    public Mono<DocumentType> getById(@PathVariable("id") String id){
        return  iDocumentTypeService.findById(id);
    }

    @PostMapping
    public Mono<DocumentType> create(@RequestBody DocumentType afiliado){
        return iDocumentTypeService.save(afiliado);
    }

    @PutMapping
    public Mono<DocumentType> update(@RequestBody DocumentType afiliado){
        return iDocumentTypeService.update(afiliado);
    }

    @DeleteMapping
    public Mono<Void> deleteById(@PathVariable("id") String id){
        return iDocumentTypeService.deleteById(id);
    }
}
