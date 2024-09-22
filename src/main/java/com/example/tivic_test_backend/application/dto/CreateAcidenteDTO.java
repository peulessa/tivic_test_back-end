package com.example.tivic_test_backend.application.dto;

import jakarta.validation.constraints.NotNull;

public class CreateAcidenteDTO {
    @NotNull(message = "UF é obrigatório")
    private String uf;
    @NotNull(message = "Cidade é obrigatório")
    private String cidade;
    @NotNull(message = "Tipo do acidente é obrigatório")
    private String tipoAcidente;
    @NotNull(message = "Causa é obrigatório")
    private String causa;
    @NotNull(message = "Data é obrigatório")
    private String data;
    @NotNull(message = "Hora é obrigatório")
    private String hora;
    @NotNull(message = "Número de vítimas é obrigatório")
    private int numeroDeVítimas;

    // Getters e Setters
    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getTipoAcidente() {
        return tipoAcidente;
    }

    public void setTipoAcidente(String tipoAcidente) {
        this.tipoAcidente = tipoAcidente;
    }

    public String getCausa() {
        return causa;
    }

    public void setCausa(String causa) {
        this.causa = causa;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public int getNumeroDeVítimas() {
        return numeroDeVítimas;
    }

    public void setNumeroDeVítimas(int numeroDeVítimas) {
        this.numeroDeVítimas = numeroDeVítimas;
    }
}
