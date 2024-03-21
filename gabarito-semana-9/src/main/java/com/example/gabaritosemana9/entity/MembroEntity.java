package com.example.gabaritosemana9.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "membros")
@Data
public class MembroEntity {
    @Id
    private Long id;

    private String nome;
    private String endereco;
    private String telefone;

}
