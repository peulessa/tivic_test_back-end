package com.example.tivic_test_backend.application.dto;

public class MesAcidenteDTO {
    private String mes;
    private Long totalAcidentes;
    private Long totalMortes;

    public MesAcidenteDTO(String mes, Long totalAcidentes, Long totalMortes) {
        this.mes = mes;
        this.totalAcidentes = totalAcidentes;
        this.totalMortes = totalMortes;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public Long getTotalAcidentes() {
        return totalAcidentes;
    }

    public void setTotalAcidentes(Long totalAcidentes) {
        this.totalAcidentes = totalAcidentes;
    }

    public Long getTotalMortes() {
        return totalMortes;
    }

    public void setTotalMortes(Long totalMortes) {
        this.totalMortes = totalMortes;
    }
}
