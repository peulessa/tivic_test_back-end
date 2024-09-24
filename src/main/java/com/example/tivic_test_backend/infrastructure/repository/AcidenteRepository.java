package com.example.tivic_test_backend.infrastructure.repository;

import com.example.tivic_test_backend.application.dto.UfAcidenteDTO;
import com.example.tivic_test_backend.domain.model.Acidente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;
import java.time.LocalDate;

public interface AcidenteRepository extends JpaRepository<Acidente, Long>, JpaSpecificationExecutor<Acidente> {
    @Query("SELECT new com.example.tivic_test_backend.application.dto.UfAcidenteDTO(a.uf, COUNT(a)) " +
    "FROM Acidente a " +
    "GROUP BY a.uf")
    List<UfAcidenteDTO> countAcidentesByUf();
    @Query("SELECT new com.example.tivic_test_backend.application.dto.UfAcidenteDTO(a.uf, COUNT(a)) " +
    "FROM Acidente a " +
    "WHERE (:uf IS NULL OR a.uf = :uf) " +
    "AND (:data_inicio IS NULL OR a.data_inversa >= :data_inicio) " +
    "AND (:data_fim IS NULL OR a.data_inversa <= :data_fim) " +
    "GROUP BY a.uf")
    List<UfAcidenteDTO> countAcidentesByUfWithFilters(
    @Param("uf") String uf,
    @Param("data_inicio") LocalDate data_inicio,
    @Param("data_fim") LocalDate data_fim
);

    
}


