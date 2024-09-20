package com.example.tivic_test_backend.application.service;

import com.example.tivic_test_backend.domain.model.Acidente;
import com.example.tivic_test_backend.infrastructure.repository.AcidenteRepository; // ajuste o caminho conforme necessário
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AcidenteService {

    private final AcidenteRepository acidenteRepository;

    public AcidenteService(AcidenteRepository acidenteRepository) {
        this.acidenteRepository = acidenteRepository;
    }

    public List<Acidente> findAll() {
        return acidenteRepository.findAll();
    }

    public Acidente findById(Long id) {
        return acidenteRepository.findById(id).orElse(null);
    }

    public Acidente save(Acidente acidente) {
        return acidenteRepository.save(acidente);
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
