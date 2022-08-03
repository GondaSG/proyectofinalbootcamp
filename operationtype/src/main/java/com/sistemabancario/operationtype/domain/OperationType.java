package com.sistemabancario.operationtype.domain;

import lombok.AllArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
@AllArgsConstructor
@Data
@Document("operationtype")
public class OperationType {
	@Id
	private String id;
	private String name;
	private Double comission;
	private String limit;
	private String code;
	private String productId;
}
