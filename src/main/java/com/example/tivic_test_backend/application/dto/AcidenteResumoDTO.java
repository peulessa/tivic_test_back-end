package com.example.tivic_test_backend.application.dto;

public class AcidenteResumoDTO {
    private Long totalAcidentes;
    private Long totalMortos;
    private Long totalFeridosLeves;
    private Long totalFeridosGraves;

    public AcidenteResumoDTO(Long totalAcidentes, Long totalMortos, Long totalFeridosLeves, Long totalFeridosGraves) {
        this.totalAcidentes = totalAcidentes;
        this.totalMortos = totalMortos;
        this.totalFeridosLeves = totalFeridosLeves;
        this.totalFeridosGraves = totalFeridosGraves;
    }

    // Getters e Setters
    public Long getTotalAcidentes() {
        return totalAcidentes;
    }

    public void setTotalAcidentes(Long totalAcidentes) {
        this.totalAcidentes = totalAcidentes;
    }

    public Long getTotalMortos() {
        return totalMortos;
    }

    public void setTotalMortos(Long totalMortos) {
        this.totalMortos = totalMortos;
    }

    public Long getTotalFeridosLeves() {
        return totalFeridosLeves;
    }

    public void setTotalFeridosLeves(Long totalFeridosLeves) {
        this.totalFeridosLeves = totalFeridosLeves;
    }

    public Long getTotalFeridosGraves() {
        return totalFeridosGraves;
    }

    public void setTotalFeridosGraves(Long totalFeridosGraves) {
        this.totalFeridosGraves = totalFeridosGraves;
    }
}
