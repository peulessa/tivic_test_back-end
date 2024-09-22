package com.example.tivic_test_backend.infrastructure.repository.specificartions;

import com.example.tivic_test_backend.domain.model.Acidente;
import org.springframework.data.jpa.domain.Specification;

import jakarta.persistence.criteria.Predicate;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AcidenteSpecification {

    public static Specification<Acidente> withFilters(String uf, String cidade, String tipoAcidente, String causa, LocalDate dataInicio, LocalDate dataFim) {
        return (root, query, criteriaBuilder) -> {

            List<Predicate> predicates = new ArrayList<>();

            if (uf != null && !uf.isEmpty()) {
                predicates.add(criteriaBuilder.equal(root.get("uf"), uf));
            }

            if (cidade != null && !cidade.isEmpty()) {
                predicates.add(criteriaBuilder.equal(root.get("cidade"), cidade));
            }

            if (tipoAcidente != null && !tipoAcidente.isEmpty()) {
                predicates.add(criteriaBuilder.equal(root.get("tipoAcidente"), tipoAcidente));
            }

            if (causa != null && !causa.isEmpty()) {
                predicates.add(criteriaBuilder.equal(root.get("causa"), causa));
            }

            if (dataInicio != null && dataFim != null) {
                predicates.add(criteriaBuilder.between(root.get("data"), dataInicio, dataFim));
            } else if (dataInicio != null) {
                predicates.add(criteriaBuilder.greaterThanOrEqualTo(root.get("data"), dataInicio));
            } else if (dataFim != null) {
                predicates.add(criteriaBuilder.lessThanOrEqualTo(root.get("data"), dataFim));
            }

            return criteriaBuilder.and(predicates.toArray(new Predicate[0]));
        };
    }
}
