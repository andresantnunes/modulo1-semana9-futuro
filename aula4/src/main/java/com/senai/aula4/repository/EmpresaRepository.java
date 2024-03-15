package com.senai.aula4.repository;

import com.senai.aula4.entites.EmpresaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // cria uma interface que será implementada pelo Spring
public interface EmpresaRepository extends JpaRepository<EmpresaEntity, Long> {

}
