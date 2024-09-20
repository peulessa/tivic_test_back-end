package com.example.tivic_test_backend.infrastructure.repository;

import com.example.tivic_test_backend.domain.model.Acidente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AcidenteRepository extends JpaRepository<Acidente, Long> {
    
}
