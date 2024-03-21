package com.example.gabaritosemana9.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name = "emprestimos")
@Data
public class EmprestimosEntity {


    @Id
    private Long id;

    @ManyToOne
    private LivroEntity livro;
    @ManyToOne
    private MembroEntity membro;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;
}
