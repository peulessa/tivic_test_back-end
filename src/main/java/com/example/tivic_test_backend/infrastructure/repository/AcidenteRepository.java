package com.example.tivic_test_backend.infrastructure.repository;

import com.example.tivic_test_backend.domain.model.Acidente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface AcidenteRepository extends JpaRepository<Acidente, Long>, JpaSpecificationExecutor<Acidente> {
    // JpaSpecificationExecutor permite o uso de Specifications
}
