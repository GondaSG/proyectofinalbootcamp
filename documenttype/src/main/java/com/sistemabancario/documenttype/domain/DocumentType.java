package com.sistemabancario.documenttype.domain;

import lombok.AllArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
@AllArgsConstructor
@Data
@Document("documenttype")
public class DocumentType{
	@Id
	private String id;
	private String name;
}
