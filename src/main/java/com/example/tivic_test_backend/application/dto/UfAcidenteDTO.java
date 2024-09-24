package com.example.tivic_test_backend.application.dto;

public class UfAcidenteDTO {
    private String uf;
    private Long totalAcidentes;

    public UfAcidenteDTO(String uf, Long totalAcidentes) {
        this.uf = uf;
        this.totalAcidentes = totalAcidentes;
    }

    // Getters e Setters
    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public Long getTotalAcidentes() {
        return totalAcidentes;
    }

    public void setTotalAcidentes(Long totalAcidentes) {
        this.totalAcidentes = totalAcidentes;
    }
}

