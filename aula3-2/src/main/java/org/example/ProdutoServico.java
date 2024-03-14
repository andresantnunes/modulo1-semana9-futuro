package org.example;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class ProdutoServico {

    Session sessao;

    public ProdutoServico(Session sessao) {
        this.sessao = sessao;
    }

    public ProdutoEntity teste(){
        Transaction transaction = sessao.beginTransaction();
        ProdutoEntity produtoConsultado = sessao.get(ProdutoEntity.class, 2L); //busca de dados da tabela produto, onde o id é igual a 1
        System.out.println("Produto Consultado: " + produtoConsultado.getNome());
        transaction.commit();

        return produtoConsultado;
    }
}
