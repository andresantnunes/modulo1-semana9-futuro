package com.example.gabaritosemana9.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "emprestimos")
@Data
public class LivroEntity {
    @Id
    private Long id;
    private String titulo;
    private Long anoPublicacao;

}
