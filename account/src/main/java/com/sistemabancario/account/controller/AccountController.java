package com.sistemabancario.account.controller;

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

import com.sistemabancario.account.domain.Account;
//import com.sistemabancario.account.service.IAccountService;
import com.sistemabancario.account.service.impl.AccountService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    private static final Logger LOGGER= LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
    @GetMapping
    public Flux<Account> findAll(){
        LOGGER.info("getAll" + "OK");
        return accountService.findAll();
    }

    @GetMapping("/{id}")
    public Mono<Account> getById(@PathVariable("id") String id){
        LOGGER.info("getById" + "OK");
        return accountService.findById(id);
    }

    @PostMapping
    public Mono<Account> create(@RequestBody Account account){
        LOGGER.info("create" + "OK");
        return accountService.save(account);
    }

    @PutMapping("/{id}")
    public Mono<Account> update(@PathVariable("id") String id,@RequestBody Account account){
        LOGGER.info("update" + "OK");
        return accountService.update(id, account);
    }
    @DeleteMapping("/{id}")
    public Mono<Void> deleteById(@PathVariable("id") String id){
        LOGGER.info("deleteById" + "OK");
        return accountService.deleteById(id);
    }

    @GetMapping("/Consultas/{client}")
    public Flux<Account> findByClient(String client){
        LOGGER.info("FindByClient" + "OK");
        return accountService.findByClient(client);
    }

}
