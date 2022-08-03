package com.sistemabancario.product.business;

import com.sistemabancario.product.entity.Producto;
import reactor.core.publisher.Mono;

public interface IBusiness {

    public Mono<Producto> save(Producto producto);
}
