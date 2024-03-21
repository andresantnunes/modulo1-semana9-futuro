package com.example.gabaritosemana9.controller;

import com.example.gabaritosemana9.entity.LivroEntity;
import com.example.gabaritosemana9.service.LivroService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livros")
public class LivroController {
    private final LivroService livroService;

    public LivroController(LivroService livroService) {
        this.livroService = livroService;
    }

    @GetMapping
    public List<LivroEntity> listarLivro(){
        return livroService.listaLivros();
    }

    @PostMapping
    public LivroEntity salvarLivro(@RequestBody LivroEntity livroEntity){
        return livroService.salvaLivro(livroEntity);
    }

    @PutMapping
    public LivroEntity atualizarLivro(@RequestBody LivroEntity livroEntity){
        return livroService.atualizaLivro(livroEntity);
    }

    @DeleteMapping
    public String deletarLivro(@RequestParam("id") Long id){
        return "Deletado";
    }
}
