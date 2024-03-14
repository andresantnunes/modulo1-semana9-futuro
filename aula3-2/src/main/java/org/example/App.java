package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    /*O Hibernate coloca uma camada de abstração sobre o JDBC e adiciona mais coisas
    * Primerio ele faz uma Sessão -> Periodo de conexão com o banco de dados
    * Tira a configuração do banco de dados de dentro do programa convencional*/

    public static void main( String[] args )
    {
        // Criação da fábrica de sessões
        // Pedir para trazer as configurações do hibernate.cfg.xml para dentro do programa
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

        // Criação da sessão
        // Cria uma conexão com o Banco de Dados através das configurações do hibernate
        Session session = sessionFactory.openSession();

        // Inserção de um novo produto
        // Cria uma transação que tem começo, meio e fim
        Transaction transaction = session.beginTransaction(); // abre uma transação, começo
        ProdutoEntity novoProduto = new ProdutoEntity(); // meio da transação é a alteração ou busca de dados
                                                        // A transação sempre usa uma Entity, que representa a Tabela
        novoProduto.setId(2L);
        novoProduto.setNome("Notebook");
        novoProduto.setPreco(2000.0);
        session.save(novoProduto); // executa uma ação no banco de dados, meio
        transaction.commit(); // finaliza a execução, fim
        // o commit no banco de dados termina e fecha uma transação que está ocorrendo


         // Consulta de produtos
//        transaction = session.beginTransaction();
//        ProdutoEntity produtoConsultado = session.get(ProdutoEntity.class, 2L); //busca de dados da tabela produto, onde o id é igual a 1
//        System.out.println("Produto Consultado: " + produtoConsultado.getNome());
//        transaction.commit();


        ProdutoServico produtoServico = new ProdutoServico(session);
        // Injeção de dependencia da session dentro de ProdutoServico
        // ou Inversão de Controle, quem esta controlando a dependencia do ProdutoServiço é uma classe externa

        ProdutoEntity produtoConsultado = produtoServico.teste();



        // Atualização de um produto
        transaction = session.beginTransaction();
        produtoConsultado.setPreco(1800.0);
        session.update(produtoConsultado);
        transaction.commit();

        // Exclusão de um produto
        transaction = session.beginTransaction();
        session.delete(produtoConsultado);
        transaction.commit();

        // Fechamento da sessão e da fábrica de sessões
        session.close();
        sessionFactory.close();
    }
}