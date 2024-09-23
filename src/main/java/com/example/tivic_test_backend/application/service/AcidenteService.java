package com.example.tivic_test_backend.application.service;

import com.example.tivic_test_backend.application.dto.CreateAcidenteDTO;
import com.example.tivic_test_backend.application.dto.FilterAcidenteDTO;
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
            dto.getUf(),
            dto.getCidade(),
            dto.getTipoAcidente(),
            dto.getCausa(),
            dto.getData().toString(),
            dto.getHora(),
            dto.getNumeroDeVítimas()
        );

        return acidenteRepository.save(acidente);
    }

    public List<Acidente> findAll() {
        return acidenteRepository.findAll();
    }

    public List<Acidente> findByFilters(FilterAcidenteDTO filterAcidenteDTO) {
        LocalDate dataInicio = filterAcidenteDTO.getDataInicio() != null ? LocalDate.parse(filterAcidenteDTO.getDataInicio()) : null;
        LocalDate dataFim = filterAcidenteDTO.getDataFim() != null ? LocalDate.parse(filterAcidenteDTO.getDataFim()) : null;

        return acidenteRepository.findAll(AcidenteSpecification.withFilters(
            filterAcidenteDTO.getUf(),
            filterAcidenteDTO.getCidade(),
            filterAcidenteDTO.getTipoAcidente(),
            filterAcidenteDTO.getCausa(),
            dataInicio,
            dataFim
        ));
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
