package com.sistemabancario.clienttype.domain;

import lombok.AllArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
@AllArgsConstructor
@Data
@Document("clienttype")
public class ClientType{
	@Id
	private String id;
	private String name;
	
}
