package com.sistemabancario.product.entity;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(value = "producto")
public class Producto {

    @Id
    private Integer id;
    private String nombre;
    private String tipo;
    private String subTipo;
    private String idClient;

    @Transient
    private String tipDoc;

    @Transient
    private String numDoc;

}
