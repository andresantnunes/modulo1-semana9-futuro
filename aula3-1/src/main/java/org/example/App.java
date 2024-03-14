package org.example;

import java.sql.*;

/**
 * Hello world!
 */
public class App {
    /*JDBC é uma API, programa, para conectar software escrito em Java com bancos de dados
    * Ele utilizada Drivers de diversos bancos de dados, cada operador de Banco de Dados fornece o próprio Driver
    * Postgres tem um driver proprio
    * O postgresql já trás consigo o JDBC*/

    // Configurações do banco de dados
    private static final String URL = "jdbc:postgresql://localhost:1432/meuBancoDeDados";
    private static final String USUARIO = "meuUsuario";
    private static final String SENHA = "minhaSenha";

    public static void main(String[] args) {

        Connection conexao = null;
        PreparedStatement consulta = null;
        ResultSet resultado = null;

        try {
            // Estabelece a conexão direta com o banco de dados
            conexao = DriverManager.getConnection(URL, USUARIO, SENHA);

            // Consulta SQL é feita diretamente no banco
            String sql = "select * from Trabalhador WHERE Salario > ?";

            // Prepara a consulta com parâmetros
            // nos premite validar os dados que irão para a consulta SQL
            // torna a consulta mais segura
            consulta = conexao.prepareStatement(sql);
            consulta.setInt(1, 10000); //setando o valor do ?

            // Executa a consulta diretamente no banco de dados
            resultado = consulta.executeQuery(); // Objeto

            // Processa os resultados
            while (resultado.next()) {
                int id = resultado.getInt("TrabalhadorID"); // para encontrar uma coluna, precisamos usar o nome e tipo dela
                String nome = resultado.getString("nome");
                String email = resultado.getString("Salario");

                // Faça algo com os dados recuperados
                System.out.println("ID: " + id + ", Nome: " + nome + ", Salario: " + email);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Fecha os recursos
            try {
                if (resultado != null) resultado.close();
                if (consulta != null) consulta.close();
                if (conexao != null) conexao.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}