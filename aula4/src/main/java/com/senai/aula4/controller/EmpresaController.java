package com.senai.aula4.controller;

import com.senai.aula4.entites.EmpresaEntity;
import com.senai.aula4.service.EmpresaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // indica um endpoint que trabalha com JSON, ou seja um endpoint REST
// adiciona o Controller a memória do Spring Boot, como um Bean
@RequestMapping("/empresa") //indica o caminho dos recursos dessa Classe
public class EmpresaController {

    private final EmpresaService empresaService;

    public EmpresaController(EmpresaService empresaService) {
        this.empresaService = empresaService;
    }

    @GetMapping //mapeia o método GET do REST, esse retorna dados
    public List<EmpresaEntity> salvaEmpresas() {
        return empresaService.listarEmpresas();
    }

    @PostMapping //mapeia o método POST do REST, esse adiciona dados
    public EmpresaEntity salvaEmpresas(
            @RequestBody EmpresaRequest empresaEntity //indica que o EmpresaEntity virá no Body da requisição
    ) {
        return empresaService.salvarEmpresa(
                new EmpresaEntity(
                        empresaEntity.getNome(),
                        empresaEntity.getCnpj(),
                        empresaEntity.getAnoCriacao()
                ));
    }

    @PutMapping
    public EmpresaEntity atualizaEmpresa(
            @RequestBody EmpresaRequest empresaEntity
    ) {
        return empresaService.atualizaEmpresa(
                new EmpresaEntity(
                        empresaEntity.getId(),
                        empresaEntity.getNome(),
                        empresaEntity.getCnpj(),
                        empresaEntity.getAnoCriacao()
                ));
    }
}
