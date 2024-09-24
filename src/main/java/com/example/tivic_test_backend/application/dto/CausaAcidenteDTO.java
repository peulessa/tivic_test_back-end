package com.example.tivic_test_backend.application.dto;

public class CausaAcidenteDTO {
    private String causaAcidente;
    private Long count;

    public CausaAcidenteDTO(String causaAcidente, Long count) {
        this.causaAcidente = causaAcidente;
        this.count = count;
    }
    
    public String getCausaAcidente() {
        return causaAcidente;
    }

    public void setCausaAcidente(String causaAcidente) {
        this.causaAcidente = causaAcidente;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }
}
