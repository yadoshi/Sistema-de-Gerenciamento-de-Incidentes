package com.eds.GerenciadorIncidente.enums;

public enum Status {

    ABERTO("Aberto"),
    FECHADO("Fechado");

    private String status;

    private Status(String status){
        this.status = status;
    }
}
