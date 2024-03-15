package com.senai.aula4.controller;

import com.senai.aula4.entites.EmpresaEntity;
import com.senai.aula4.service.EmpresaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController // indica um endpoint que trabalha com JSON, ou seja um endpoint REST
// adiciona o Controller a memória do Spring Boot, como um Bean
@RequestMapping("/empresa") //indica o caminho dos recursos dessa Classe
@RequiredArgsConstructor
public class EmpresaController {

    private final EmpresaService empresaService;

    @GetMapping //mapeia o método GET do REST, esse retorna dados
    public List<EmpresaEntity> retornarEmpresas(){
        return empresaService.listarEmpresas();
    }

    @PostMapping //mapeia o método POST do REST, esse adiciona dados
    public EmpresaEntity retornarEmpresas(EmpresaEntity empresaEntity){
        return empresaService.salvarEmpresa(empresaEntity);
    }
}
