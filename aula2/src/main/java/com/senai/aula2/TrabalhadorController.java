package com.senai.aula2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/trabalhador")
public class TrabalhadorController {

    private final TrabalhadorRepository trabalhadorRepository;

    public TrabalhadorController(TrabalhadorRepository trabalhadorRepository) {
        this.trabalhadorRepository = trabalhadorRepository;
    }

    @GetMapping
    public List<TrabalhadorEntity> listarTrabalhadores(){
        return trabalhadorRepository.findAll();
    }
}
