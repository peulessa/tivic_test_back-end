package com.example.tivic_test_backend.application.dto;

public class MesAcidenteDTO {
    private String mes;
    private Long totalAcidentes;

    public MesAcidenteDTO(String mes, Long totalAcidentes) {
        this.mes = mes;
        this.totalAcidentes = totalAcidentes;
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
}
