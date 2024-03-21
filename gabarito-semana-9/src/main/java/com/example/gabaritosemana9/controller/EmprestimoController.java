package com.example.gabaritosemana9.controller;

import com.example.gabaritosemana9.entity.EmprestimosEntity;
import com.example.gabaritosemana9.service.EmprestimoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emprestimos")
public class EmprestimoController {

    private final EmprestimoService emprestimoService;

    public EmprestimoController(EmprestimoService emprestimoService) {
        this.emprestimoService = emprestimoService;
    }

    @GetMapping
    public List<EmprestimosEntity> listarEmprestimos(){
        return emprestimoService.listaEmprestimos();
    }

    @PostMapping
    public EmprestimosEntity salvarEmprestimos(@RequestBody  EmprestimosEntity emprestimosEntity){
        return emprestimoService.salvaEmprestimos(emprestimosEntity);

    }

    @PutMapping
    public EmprestimosEntity atualizarEmprestimos(@RequestBody  EmprestimosEntity emprestimosEntity){
        return emprestimoService.atualizaEmprestimos(emprestimosEntity);

    }

    @DeleteMapping
    public String deletarEmprestimos(@RequestParam("id") Long id){
        emprestimoService.deletaEmprestimos(id);
        return "Deletado";

    }
}
