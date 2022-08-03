package com.sistemabancario.product.clients.model;
import lombok.Data;

@Data
public class Cliente {

    private String id;
    private String nombres;
    private String apellidos;
    private String tipoDocumento;
    private String numeroDocumento;
    private Integer tipo; // 1 = personal ; 2 = Empresarial

}
