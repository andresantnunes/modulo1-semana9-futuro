package com.senai.aula2;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
@Entity
@Table(name = "empresa")
public class EmpresaEntity {
    @Id
    private Long id;

    @Column
    private String nome;

//    @OneToMany
//    List<TrabalhadorEntity> trabalhadores;

}
