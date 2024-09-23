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
    private String data_inversa;
    private String dia_semana; 
    private String horario;
    private String uf; 
    private String br; 
    private int km; 
    private String municipio; 
    private String causa_acidente;
    private String tipo_acidente;
    private String classificacao_acidente; 
    private String fase_dia;
    private String sentido_via; 
    private String condicao_metereologica; 
    private String tipo_pista; 
    private String tracado_via; 
    private String uso_solo; 
    private int pessoas;
    private int mortos; 
    private int feridos_leves; 
    private int feridos_graves; 
    private int ilesos; 
    private int ignorados; 
    private int feridos; 
    private int veiculos; 
    private double latitude;
    private double longitude;
    private String regional; 
    private String delegacia; 
    private String uop; 

    public Acidente() {}

    public Acidente(
        String data_inversa, String dia_semana, String horario, String uf, String br, int km,
        String municipio, String causa_acidente, String tipo_acidente, String classificacao_acidente,
        String fase_dia, String sentido_via, String condicao_metereologica, String tipo_pista,
        String tracado_via, String uso_solo, int pessoas, int mortos, int feridos_leves,
        int feridos_graves, int ilesos, int ignorados, int feridos, int veiculos,
        double latitude, double longitude, String regional, String delegacia, String uop) {
            this.data_inversa = data_inversa;
            this.dia_semana = dia_semana;
            this.horario = horario;
            this.uf = uf;
            this.br = br;
            this.km = km;
            this.municipio = municipio;
            this.causa_acidente = causa_acidente;
            this.tipo_acidente = tipo_acidente;
            this.classificacao_acidente = classificacao_acidente;
            this.fase_dia = fase_dia;
            this.sentido_via = sentido_via;
            this.condicao_metereologica = condicao_metereologica;
            this.tipo_pista = tipo_pista;
            this.tracado_via = tracado_via;
            this.uso_solo = uso_solo;
            this.pessoas = pessoas;
            this.mortos = mortos;
            this.feridos_leves = feridos_leves;
            this.feridos_graves = feridos_graves;
            this.ilesos = ilesos;
            this.ignorados = ignorados;
            this.feridos = feridos;
            this.veiculos = veiculos;
            this.latitude = latitude;
            this.longitude = longitude;
            this.regional = regional;
            this.delegacia = delegacia;
            this.uop = uop;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getData_inversa() {
        return data_inversa;
    }

    public void setData_inversa(String data_inversa) {
        this.data_inversa = data_inversa;
    }

    public String getDia_semana() {
        return dia_semana;
    }

    public void setDia_semana(String dia_semana) {
        this.dia_semana = dia_semana;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

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

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
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

    public String getClassificacao_acidente() {
        return classificacao_acidente;
    }

    public void setClassificacao_acidente(String classificacao_acidente) {
        this.classificacao_acidente = classificacao_acidente;
    }

    public String getFase_dia() {
        return fase_dia;
    }

    public void setFase_dia(String fase_dia) {
        this.fase_dia = fase_dia;
    }

    public String getSentido_via() {
        return sentido_via;
    }

    public void setSentido_via(String sentido_via) {
        this.sentido_via = sentido_via;
    }

    public String getCondicao_metereologica() {
        return condicao_metereologica;
    }

    public void setCondicao_metereologica(String condicao_metereologica) {
        this.condicao_metereologica = condicao_metereologica;
    }

    public String getTipo_pista() {
        return tipo_pista;
    }

    public void setTipo_pista(String tipo_pista) {
        this.tipo_pista = tipo_pista;
    }

    public String getTracado_via() {
        return tracado_via;
    }

    public void setTracado_via(String tracado_via) {
        this.tracado_via = tracado_via;
    }

    public String getUso_solo() {
        return uso_solo;
    }

    public void setUso_solo(String uso_solo) {
        this.uso_solo = uso_solo;
    }

    public int getPessoas() {
        return pessoas;
    }

    public void setPessoas(int pessoas) {
        this.pessoas = pessoas;
    }

    public int getMortos() {
        return mortos;
    }

    public void setMortos(int mortos) {
        this.mortos = mortos;
    }

    public int getFeridos_leves() {
        return feridos_leves;
    }

    public void setFeridos_leves(int feridos_leves) {
        this.feridos_leves = feridos_leves;
    }

    public int getFeridos_graves() {
        return feridos_graves;
    }

    public void setFeridos_graves(int feridos_graves) {
        this.feridos_graves = feridos_graves;
    }

    public int getIlesos() {
        return ilesos;
    }

    public void setIlesos(int ilesos) {
        this.ilesos = ilesos;
    }

    public int getIgnorados() {
        return ignorados;
    }

    public void setIgnorados(int ignorados) {
        this.ignorados = ignorados;
    }

    public int getFeridos() {
        return feridos;
    }

    public void setFeridos(int feridos) {
        this.feridos = feridos;
    }

    public int getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(int veiculos) {
        this.veiculos = veiculos;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getRegional() {
        return regional;
    }

    public void setRegional(String regional) {
        this.regional = regional;
    }

    public String getDelegacia() {
        return delegacia;
    }

    public void setDelegacia(String delegacia) {
        this.delegacia = delegacia;
    }

    public String getUop() {
        return uop;
    }

    public void setUop(String uop) {
        this.uop = uop;
    }
}
