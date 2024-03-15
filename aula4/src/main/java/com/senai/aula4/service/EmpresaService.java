package com.senai.aula4.service;

import com.senai.aula4.entites.EmpresaEntity;
import com.senai.aula4.repository.EmpresaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmpresaService {

    private final EmpresaRepository empresaRepository;

    public List<EmpresaEntity> listarEmpresas() {
        return empresaRepository.findAll();
        // método JPA do repository para busca de todos o dados de uma tabela
    }

    public EmpresaEntity salvarEmpresa(EmpresaEntity empresaEntity) {
        return empresaRepository.save(empresaEntity);// método JPA para salva um Entity
    }
}
