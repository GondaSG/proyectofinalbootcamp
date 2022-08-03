package com.sistemabancario.client.clients;

import lombok.Data;

@Data
public class Producto {

    private Integer id;
    private String nombres;
    private Integer tipo;// 1= PASIVO - 2=ACTIVO
    private Integer subTipo; // 1=CC - 2=CA - 3=PF (Pasivos) / 4=AC-P ; 5=AC-E ;  6=TC-P ; 7=TC-E (Activos)

}
