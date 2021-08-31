package com.waldecleber.ponto.service;

import com.waldecleber.ponto.dto.JornadaTrabalhoDTO;
import com.waldecleber.ponto.repository.JornadaRepository;
import org.springframework.stereotype.Service;

@Service
public class JornadaService {

    private final JornadaRepository jornadaRepository;

    public JornadaService(JornadaRepository jornadaRepository) {
        this.jornadaRepository = jornadaRepository;
    }


//    public JornadaTrabalhoDTO buscarJornadas() {
//        return  jornadaRepository.findAll();
//    }
}
