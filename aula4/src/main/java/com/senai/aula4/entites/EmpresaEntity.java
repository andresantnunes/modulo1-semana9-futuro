package com.senai.aula4.entites;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Table(name="empresa") // define métadados de uma tabela
@Entity // define que uma tabela é um entity para o Spring JPA
@Data // lombook para criar Getter e Setters automaticamente
public class EmpresaEntity {

    @Id // define uma coluna id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
        // define que o valor do ID é gerado automaticamente
    private Long id;

    private String nome;
    private String cnpj;

    private LocalDate dataCriacao; //data_criacao nas tabelas

}
