package com.example.tivic_test_backend.application.dto;

public class FilterAcidenteDTO {
    private String uf;
    private String br; // Filtrar por BR
    private String municipio; // Filtrar por município
    private String causa_acidente; // Nome ajustado para refletir a nova estrutura
    private String tipo_acidente; // Nome ajustado para refletir a nova estrutura
    private String data_inicio; // Formato: "YYYY-MM-DD"
    private String data_fim; // Formato: "YYYY-MM-DD"
    private String dia_semana; // Filtrar por dia da semana
    private String fase_dia; // Filtrar por fase do dia

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getBr() {
        return br;
    }

    public void setBr(String br) {
        this.br = br;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getCausa_acidente() {
        return causa_acidente;
    }

    public void setCausa_acidente(String causa_acidente) {
        this.causa_acidente = causa_acidente;
    }

    public String getTipo_acidente() {
        return tipo_acidente;
    }

    public void setTipo_acidente(String tipo_acidente) {
        this.tipo_acidente = tipo_acidente;
    }

    public String getData_inicio() {
        return data_inicio;
    }

    public void setData_inicio(String data_inicio) {
        this.data_inicio = data_inicio;
    }

    public String getData_fim() {
        return data_fim;
    }

    public void setData_fim(String data_fim) {
        this.data_fim = data_fim;
    }

    public String getDia_semana() {
        return dia_semana;
    }

    public void setDia_semana(String dia_semana) {
        this.dia_semana = dia_semana;
    }

    public String getFase_dia() {
        return fase_dia;
    }

    public void setFase_dia(String fase_dia) {
        this.fase_dia = fase_dia;
    }
}
