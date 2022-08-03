package com.sistemabancario.clienttype.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.sistemabancario.clienttype.domain.ClientType;
import org.springframework.stereotype.Repository;

@Repository
public interface IClientTypeRepository extends ReactiveCrudRepository<ClientType,String> {

}
