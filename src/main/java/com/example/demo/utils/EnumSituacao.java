package com.example.demo.utils;

public enum EnumSituacao {
    ATI("Ativo"),
    INA("Inativo");

    private String situacao;

    EnumSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getSituacao() {
        return situacao;
    }
}
