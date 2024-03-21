package com.example.gabaritosemana9.service;

import com.example.gabaritosemana9.entity.MembroEntity;
import com.example.gabaritosemana9.repository.MembroRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MembroService {

    private final MembroRepository membroRepository;

    public MembroService(MembroRepository membroRepository) {
        this.membroRepository = membroRepository;
    }


    public List<MembroEntity> listMembros() {
        return membroRepository.findAll();

    }

    public MembroEntity salvaMembros(MembroEntity membroEntity) {
        return membroRepository.save(membroEntity);
    }

    public MembroEntity atualizaMembro(MembroEntity membroEntity) {
        return membroRepository.update(
                membroEntity.getId(),
                membroEntity.getNome(),
                membroEntity.getEndereco(),
                membroEntity.getTelefone()
        );
    }

    public void deletaMembro(Long id) {
        membroRepository.deleteById(id);
    }
}
