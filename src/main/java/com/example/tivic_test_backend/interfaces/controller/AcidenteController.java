package com.example.tivic_test_backend.interfaces.controller;

import com.example.tivic_test_backend.domain.model.Acidente;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import jakarta.validation.Valid;

import com.example.tivic_test_backend.application.dto.CreateAcidenteDTO;
import com.example.tivic_test_backend.application.dto.FilterAcidenteDTO;
import com.example.tivic_test_backend.application.service.AcidenteService;

// import org.hibernate.mapping.Map; // Removed to avoid collision with java.util.Map
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.HashMap;
import java.util.Map;


@RestController
@RequestMapping("/api/acidentes")
public class AcidenteController {

    private final AcidenteService acidenteService;

    public AcidenteController(AcidenteService acidenteService) {
        this.acidenteService = acidenteService;
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String, String>> handleValidationExceptions(MethodArgumentNotValidException ex) {
        Map<String, String> errors = new HashMap<>();
        ex.getBindingResult().getAllErrors().forEach((error) -> {
            String fieldName = ((FieldError) error).getField();
            String errorMessage = error.getDefaultMessage();
            errors.put(fieldName, errorMessage);
        });
        return new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST);
    }
    
    @PostMapping
    @Operation(summary = "Adicionar um novo acidente", description = "Adiciona um novo acidente ao sistema")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "201", description = "Acidente criado com sucesso", content = @Content(schema = @Schema(implementation = Acidente.class))),
        @ApiResponse(responseCode = "400", description = "Dados fornecidos são inválidos", content = @Content(schema = @Schema(implementation = Map.class))),
        @ApiResponse(responseCode = "422", description = "Erro de negócio", content = @Content(schema = @Schema(implementation = String.class)))
    })
    public ResponseEntity<Acidente> addAcidente(@Valid @RequestBody CreateAcidenteDTO createAcidenteDTO) {
        Acidente novoAcidente = acidenteService.save(createAcidenteDTO);
        return new ResponseEntity<>(novoAcidente, HttpStatus.CREATED);
    }


    @GetMapping
    @Operation(summary = "Obter todos os acidentes", description = "Retorna uma lista de todos os acidentes")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Lista de acidentes retornada com sucesso", content = @Content(schema = @Schema(implementation = Acidente.class)))
    })
    public List<Acidente> getAllAcidentes() {
        return acidenteService.findAll();
    }

    @GetMapping("/busca-filtrada")
    @Operation(summary = "Buscar acidentes com filtros", description = "Retorna uma lista de acidentes filtrados pelos parâmetros fornecidos")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Lista de acidentes filtrados retornada com sucesso", content = @Content(schema = @Schema(implementation = Acidente.class)))
    })
    public ResponseEntity<List<Acidente>> buscarAcidentes(FilterAcidenteDTO filterAcidenteDTO) {
        List<Acidente> acidentes = acidenteService.findByFilters(filterAcidenteDTO);
        return ResponseEntity.ok(acidentes);
    }

    @GetMapping("/{id}")
    @Operation(summary = "Obter um acidente por ID", description = "Retorna um acidente específico pelo ID")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Acidente retornado com sucesso", content = @Content(schema = @Schema(implementation = Acidente.class))),
        @ApiResponse(responseCode = "404", description = "Acidente não encontrado", content = @Content(schema = @Schema(implementation = String.class)))
    })
    public Acidente getOneAcidente(@PathVariable Long id) {
        return acidenteService.findById(id);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Atualizar um acidente", description = "Atualiza os dados de um acidente existente")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Acidente atualizado com sucesso", content = @Content(schema = @Schema(implementation = Acidente.class))),
        @ApiResponse(responseCode = "404", description = "Acidente não encontrado", content = @Content(schema = @Schema(implementation = String.class)))
    })
    public Acidente patchAcidente(@PathVariable Long id, @RequestBody Acidente acidente) {
        return acidenteService.update(id, acidente);
    }

    @DeleteMapping("/{id}")
    public void deleteAcidente(@PathVariable Long id) {
        acidenteService.delete(id);
    }
}
