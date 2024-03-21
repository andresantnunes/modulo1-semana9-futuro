package com.example.gabaritosemana9.controller;

import com.example.gabaritosemana9.entity.MembroEntity;
import com.example.gabaritosemana9.service.MembroService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/membros")
public class MembroController {
    private final MembroService membroService;

    public MembroController(MembroService membroService) {
        this.membroService = membroService;
    }

    @GetMapping
    public List<MembroEntity> listarMembros(){
        return membroService.listMembros();
    }

    @PostMapping
    public MembroEntity salvarMembro(@RequestParam MembroEntity membroEntity){
        return membroService.salvaMembros(membroEntity);
    }

    @PutMapping
    public MembroEntity atualizarMembro(@RequestParam MembroEntity membroEntity){
        return membroService.atualizaMembro(membroEntity);
    }

    @DeleteMapping
    public String deletarMembro(@RequestParam("id") Long id){
        membroService.deletaMembro(id);
        return "Deletado";
    }
}
