package com.example.tivic_test_backend.application.dto;

import jakarta.validation.constraints.NotNull;

public class CreateAcidenteDTO {
    @NotNull(message = "Data Inversa é obrigatório")
    private String data_inversa; 
    
    @NotNull(message = "Dia da Semana é obrigatório")
    private String dia_semana; 
    
    @NotNull(message = "Horário é obrigatório")
    private String horario;
    
    @NotNull(message = "UF é obrigatório")
    private String uf; 
    
    @NotNull(message = "BR é obrigatório")
    private String br; 
    
    @NotNull(message = "KM é obrigatório")
    private int km; 
    
    @NotNull(message = "Município é obrigatório")
    private String municipio; 
    
    @NotNull(message = "Causa do Acidente é obrigatório")
    private String causa_acidente; 
    
    @NotNull(message = "Tipo do Acidente é obrigatório")
    private String tipo_acidente;
    
    @NotNull(message = "Classificação do Acidente é obrigatório")
    private String classificacao_acidente;
    
    @NotNull(message = "Fase do Dia é obrigatório")
    private String fase_dia; 

    @NotNull(message = "Sentido da Via é obrigatório")
    private String sentido_via; 
    
    @NotNull(message = "Condição Meteorológica é obrigatório")
    private String condicao_metereologica; 
    
    @NotNull(message = "Tipo de Pista é obrigatório")
    private String tipo_pista; 
    
    @NotNull(message = "Traçado da Via é obrigatório")
    private String tracado_via; 
    
    @NotNull(message = "Uso do Solo é obrigatório")
    private String uso_solo; 
    
    @NotNull(message = "Número de Pessoas é obrigatório")
    private int pessoas;
    
    private int mortos; 
    private int feridos_leves; 
    private int feridos_graves; 
    private int ilesos; 
    private int ignorados; 
    private int feridos; 
    private int veiculos; 
    
    @NotNull(message = "Latitude é obrigatória")
    private double latitude;
    
    @NotNull(message = "Longitude é obrigatória")
    private double longitude;
    
    private String regional; 
    private String delegacia; 
    private String uop; 

    // Getters e Setters

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
