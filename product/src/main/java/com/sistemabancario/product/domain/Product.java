package com.sistemabancario.product.domain;
import lombok.AllArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
@AllArgsConstructor
@Data
@Document("product")
public class Product {
	@Id
	private String id;
	private String name;

}
