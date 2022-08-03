package com.sistemabancario.operationtype.repository;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import com.sistemabancario.operationtype.domain.OperationType;
import org.springframework.stereotype.Repository;

@Repository
public interface IOperationTypeRepository extends ReactiveCrudRepository<OperationType,String> {

}
