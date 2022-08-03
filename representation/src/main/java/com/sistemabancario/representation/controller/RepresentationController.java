package com.sistemabancario.representation.controller;

import java.lang.invoke.MethodHandles;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sistemabancario.representation.domain.Representation;
import com.sistemabancario.representation.service.IRepresentationService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/representation")
public class RepresentationController {

    @Autowired
    private IRepresentationService representationService;

    private static final Logger LOGGER= LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
   @GetMapping
    public Flux<Representation> findAll(){
       LOGGER.info("getAll" + "OK");
       return representationService.findAll();
   }

    @GetMapping("/{id}")
    public Mono<Representation> getById(@PathVariable("id") String id){
        LOGGER.info("getById" + "OK");
       return representationService.findById(id);
   }

    @PostMapping
    public Mono<Representation> create(@RequestBody Representation representation){
        LOGGER.info("create" + "OK");
       return representationService.save(representation);
   }

    @PutMapping
    public Mono<Representation> update(@RequestBody Representation representation){
        LOGGER.info("update" + "OK");
       return representationService.update(representation);
   }

    @DeleteMapping
    public Mono<Void> deleteById(@PathVariable("id") String id){
        LOGGER.info("deleteById" + "OK");
       return representationService.deleteById(id);
   }
}
