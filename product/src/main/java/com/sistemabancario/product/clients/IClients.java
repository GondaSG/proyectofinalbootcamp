package com.sistemabancario.product.clients;

import com.sistemabancario.product.clients.model.Cliente;
import reactor.core.publisher.Flux;

public interface IClients {

    public Flux<Cliente> getClientByTipNum(String tipo, String numDoc);
}
