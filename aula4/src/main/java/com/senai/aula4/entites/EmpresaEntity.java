package com.senai.aula4.entites;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Table(name="empresa") // define métadados de uma tabela
@Entity // define que uma tabela é um entity para o Spring JPA
@Data // lombok para criar Getter e Setters automaticamente
@NoArgsConstructor //Toda entity precisa ter um construtor vazio por padrão
public class EmpresaEntity {

    @Id // define uma coluna id
    @GeneratedValue(strategy = GenerationType.AUTO) // estrategia AUTO funciona no postgres
        // define que o valor do ID é gerado automaticamente
    private Long id;

    private String nome;
    private String cnpj;

    private Long anoCriacao; //data_criacao nas tabelas

    public EmpresaEntity(String nome, String cnpj, Long anoCriacao) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.anoCriacao = anoCriacao;
    }
}
