package com.example.tivic_test_backend.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Acidente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String uf;
    private String cidade;
    private String tipoAcidente;
    private String causa;
    private String data;
    private String hora;
    private int numeroDeVítimas;

    public Acidente() {}

    public Acidente(String uf, String cidade, String tipoAcidente, String causa, String data, String hora, int numeroDeVítimas) {
        this.uf = uf;
        this.cidade = cidade;
        this.tipoAcidente = tipoAcidente;
        this.causa = causa;
        this.data = data;
        this.hora = hora;
        this.numeroDeVítimas = numeroDeVítimas;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUf(){
        return uf;
    }

    public void setUf(String uf){
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

    public String getHora(){
        return hora;
    }

    public void setHora(String hora){
        this.hora = hora;
    }

    public int getNumeroDeVítimas() {
        return numeroDeVítimas;
    }

    public void setNumeroDeVítimas(int numeroDeVítimas) {
        this.numeroDeVítimas = numeroDeVítimas;
    }
}
