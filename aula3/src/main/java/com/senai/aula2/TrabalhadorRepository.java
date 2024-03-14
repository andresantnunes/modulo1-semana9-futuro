package com.senai.aula2;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


//Atua como uma "janela" para os comando DDL do banco de dados
@Repository // indica para o Spring que esse é um repositório de dados
public interface TrabalhadorRepository extends JpaRepository<TrabalhadorEntity, Long> {
//public interface TrabalhadorRepository extends CrudRepository<TrabalhadorEntity, Long> {

}
