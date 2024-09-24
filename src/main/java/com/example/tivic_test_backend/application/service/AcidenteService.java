package com.example.tivic_test_backend.application.service;

import com.example.tivic_test_backend.application.dto.AcidenteResumoDTO;
import com.example.tivic_test_backend.application.dto.CausaAcidenteDTO;
import com.example.tivic_test_backend.application.dto.CreateAcidenteDTO;
import com.example.tivic_test_backend.application.dto.FilterAcidenteDTO;
import com.example.tivic_test_backend.application.dto.MesAcidenteDTO;
import com.example.tivic_test_backend.application.dto.UfAcidenteDTO;
import com.example.tivic_test_backend.application.exception.AppException;
import com.example.tivic_test_backend.domain.model.Acidente;
import com.example.tivic_test_backend.infrastructure.repository.AcidenteRepository;
import com.example.tivic_test_backend.infrastructure.repository.specifications.AcidenteSpecification;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class AcidenteService {

    private final AcidenteRepository acidenteRepository;

    public AcidenteService(AcidenteRepository acidenteRepository) {
        this.acidenteRepository = acidenteRepository;
    }

    public Acidente save(CreateAcidenteDTO dto) {
        Acidente acidente = new Acidente(
            dto.getData_inversa(),
            dto.getDia_semana(),
            dto.getHorario(),
            dto.getUf(),
            dto.getBr(),
            dto.getKm(),
            dto.getMunicipio(),
            dto.getCausa_acidente(),
            dto.getTipo_acidente(),
            dto.getClassificacao_acidente(),
            dto.getFase_dia(),
            dto.getSentido_via(),
            dto.getCondicao_metereologica(),
            dto.getTipo_pista(),
            dto.getTracado_via(),
            dto.getUso_solo(),
            dto.getPessoas(),
            dto.getMortos(),
            dto.getFeridos_leves(),
            dto.getFeridos_graves(),
            dto.getIlesos(),
            dto.getIgnorados(),
            dto.getFeridos(),
            dto.getVeiculos(),
            dto.getLatitude(),
            dto.getLongitude(),
            dto.getRegional(),
            dto.getDelegacia(),
            dto.getUop()
        );

        return acidenteRepository.save(acidente);
    }

    public List<Acidente> findAll() {
        return acidenteRepository.findAll();
    }

    public AcidenteResumoDTO getAcidenteResumo() {
        return acidenteRepository.getAcidenteResumo();
    }

    public List<Acidente> findByFilters(FilterAcidenteDTO filterAcidenteDTO) {
        LocalDate dataInicio = filterAcidenteDTO.getData_inicio() != null ? LocalDate.parse(filterAcidenteDTO.getData_inicio()) : null;
        LocalDate dataFim = filterAcidenteDTO.getData_fim() != null ? LocalDate.parse(filterAcidenteDTO.getData_fim()) : null;

        return acidenteRepository.findAll(AcidenteSpecification.withFilters(
            filterAcidenteDTO.getUf(),
            filterAcidenteDTO.getMunicipio(),
            filterAcidenteDTO.getTipo_acidente(),
            filterAcidenteDTO.getCausa_acidente(),
            dataInicio,
            dataFim
        ));
    }


    public List<UfAcidenteDTO> getAcidentesAgregadosPorUf() {
        return acidenteRepository.countAcidentesByUf();
    }

    public List<UfAcidenteDTO> getAcidentesAgregadosPorUfWithFilters(FilterAcidenteDTO filter) {
        LocalDate dataInicio = filter.getData_inicio() != null ? LocalDate.parse(filter.getData_inicio()) : null;
        LocalDate dataFim = filter.getData_fim() != null ? LocalDate.parse(filter.getData_fim()) : null;
        return acidenteRepository.countAcidentesByUfWithFilters(filter.getUf(), dataInicio, dataFim);
    }

        public List<CausaAcidenteDTO> findCountAcidentesByCausaAcidente() {
        return acidenteRepository.countAcidentesByCausaAcidente();
    }

    public List<CausaAcidenteDTO> findCountAcidentesByCausaAcidenteWithFilters(String causa_acidente, LocalDate dataInicio, LocalDate dataFim) {
        return acidenteRepository.countAcidentesByCausaAcidenteWithFilters(causa_acidente, dataInicio, dataFim);
    }

    public List<MesAcidenteDTO> countAcidentesByMes() {
        return acidenteRepository.countAcidentesByMes();
    }


    public Acidente findById(Long id) {
        return acidenteRepository.findById(id)
                .orElseThrow(() -> new AppException("Acidente não encontrado"));
    }

    public Acidente update(Long id, Acidente acidente) {
        if (!acidenteRepository.existsById(id)) {
            throw new RuntimeException("Acidente não encontrado");
        }
        acidente.setId(id);
        return acidenteRepository.save(acidente);
    }
    
    public void delete(Long id) {
        if (!acidenteRepository.existsById(id)) {
            throw new RuntimeException("Acidente não encontrado");
        }
        acidenteRepository.deleteById(id);
    }
}
