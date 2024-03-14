package com.senai.aula2;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity // indica que a classe é uma entidade que representa uma tabela
@Table(name = "trabalhador") // da as caracteristicas da tabela no banco de dados, no caso o nome da tabela
public class TrabalhadorEntity {
    @Id // sou obrigado a ter um @Id em todas as entities do JPA
    private Long id;

    @Column // opcional caso o nome da coluna na tabela seja o mesmo do campo no Java
    private String nome;

    @Column(name = "data_nascimento") // preciso do @Column para indiicar o nome da coluna na tabela
    private LocalDate nascimento;

    @ManyToOne(fetch = FetchType.LAZY) // indica que eu tenho um relacionamento N:1, onde essa classe receber os dados de EmpresaEntity
//    @JoinColumn(name = "empresa_id") //opcional, no caso de precisar definir o nome ou outra caracteristica da coluna em questão
    private EmpresaEntity empresaEntity;
}
