package com.senai.aula4.controller;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class EmpresaRequest {
    private Long id;
    private String nome;
    private String cnpj;
    private Long anoCriacao;
}
