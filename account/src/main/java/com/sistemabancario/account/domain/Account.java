package com.sistemabancario.account.domain;

import lombok.AllArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
@AllArgsConstructor
@Data
@Document("account")
public class Account {
    @Id
    private String id;
    private Long clientId;
    private Long accountTypeId;
    private String nroCuenta;
    private Double saldo;
    private Long representationId;
    private static final long serialVersionUID = 1L;
}
