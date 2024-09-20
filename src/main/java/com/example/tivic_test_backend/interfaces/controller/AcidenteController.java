package com.example.tivic_test_backend.interfaces.controller;

import com.example.tivic_test_backend.domain.model.Acidente;
import com.example.tivic_test_backend.application.service.AcidenteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/acidentes")
public class AcidenteController {

    private final AcidenteService acidenteService;

    public AcidenteController(AcidenteService acidenteService) {
        this.acidenteService = acidenteService;
    }

    @GetMapping
    public List<Acidente> getAllAcidentes() {
        return acidenteService.findAll();
    }

    // Obter acidente por ID
    @GetMapping("/{id}")
    public Acidente getOneAcidente(@PathVariable Long id) {
        return acidenteService.findById(id);
    }

    // Adicionar um novo acidente
    @PostMapping
    public Acidente addAcidente(@RequestBody Acidente acidente) {
        return acidenteService.save(acidente);
    }

    // Atualizar um acidente
    @PutMapping("/{id}")
    public Acidente patchAcidente(@PathVariable Long id, @RequestBody Acidente acidente) {
        return acidenteService.update(id, acidente);
    }

    // Deletar um acidente
    @DeleteMapping("/{id}")
    public void deleteAcidente(@PathVariable Long id) {
        acidenteService.delete(id);
    }
}
