package com.sistemabancario.accountype.repository;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import com.sistemabancario.accountype.domain.AccountType;
import org.springframework.stereotype.Repository;

@Repository
public interface IAccountTypeRepository extends ReactiveCrudRepository<AccountType, String> {

}
