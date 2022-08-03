package com.sistemabancario.client.business;
import ch.qos.logback.core.net.server.Client;
import reactor.core.publisher.Mono;


public interface IBusiness {

    Mono<com.sistemabancario.client.domain.Client> save(com.sistemabancario.client.domain.Client cliente);

    public Mono<Client> save(Client client );
}
