package com.senai.aula4.entites;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "funcionario")
@Entity
@Data
@NoArgsConstructor
public class FuncionarioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nome;

    @ManyToOne // cria uma empresa_id na tabela fucionario
    @JoinColumn(name = "empresa_id") //define o nome do campo da FK no banco de dados
    private EmpresaEntity empresa;

}
