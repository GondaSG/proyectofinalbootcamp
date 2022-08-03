package com.sistemabancario.client.domain;

import lombok.AllArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
@AllArgsConstructor
@Data
@Document("client")
public class Client{

	@Id
	private String id;
	private String name;
	private String lastName;
	private String documentNumber;
	private String phoneNumber;
	private String businessName;
	private String clientTypeId;
	private String documentTypeId;

	public Object getTipo() {
		return null;
	}
}
