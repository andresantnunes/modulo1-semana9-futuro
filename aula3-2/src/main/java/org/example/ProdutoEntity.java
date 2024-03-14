package org.example;

import jakarta.persistence.*;

@Entity
@Table(name = "produtos")
public class ProdutoEntity {


    @Id
//    @GeneratedValue(strategy = GenerationType.SEQUENCE) // indica uma estratégia de geração de ID automatico
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column
    private double preco;

    // Getters e Setters


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
