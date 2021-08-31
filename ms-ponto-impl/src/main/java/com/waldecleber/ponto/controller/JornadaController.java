package com.waldecleber.ponto.controller;

import com.waldecleber.ponto.dto.JornadaTrabalhoDTO;
import com.waldecleber.ponto.model.JornadaTrabalho;
import com.waldecleber.ponto.service.JornadaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jornada")
public class JornadaController {

    private final JornadaService jornadaService;

    public JornadaController(JornadaService jornadaService) {
        this.jornadaService = jornadaService;
    }

//    @GetMapping
//    public ResponseEntity<JornadaTrabalhoDTO> buscarJornadas() {
//        return ResponseEntity.ok(jornadaService.buscarJornadas());
//    }

}
