package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;

public class ExercicioConectDB {
    String url = "jdbc:postgresql://localhost:5432/postgres";
    String user = "postgres"; // substitua com seu usuário do PostgreSQL
    String password = "postgres"; // substitua com sua senha do PostgreSQL

    try(
    Connection con = DriverManager.getConnection(url, user, password);
    Statement stmt = con.createStatement())
    {

        String query = "SELECT nome, preco FROM produtos";
        ResultSet rs = stmt.executeQuery(query);

        String nomeMaisCaro = "";
        String nomeMaisBarato = "";
        double precoMaisCaro = Double.MIN_VALUE;
        double precoMaisBarato = Double.MAX_VALUE;
        double somaPrecos = 0;
        int totalProdutos = 0;

        System.out.println("Lista de Produtos:");
        while (rs.next()) {
            String nome = rs.getString("nome");
            double preco = rs.getDouble("preco");

            System.out.println("Nome: " + nome + ", Preço: " + preco);

            if (preco > precoMaisCaro) {
                precoMaisCaro = preco;
                nomeMaisCaro = nome;
            }

            if (preco < precoMaisBarato) {
                precoMaisBarato = preco;
                nomeMaisBarato = nome;
            }

            somaPrecos += preco;
            totalProdutos++;
        }

        double mediaPrecos = somaPrecos / totalProdutos;

        System.out.println("\nProduto mais caro: " + nomeMaisCaro + " (Preço: " + precoMaisCaro + ")");
        System.out.println("Produto mais barato: " + nomeMaisBarato + " (Preço: " + precoMaisBarato + ")");
        System.out.println("Média de preços: " + mediaPrecos);

    }catch(
    Exception e)
    {
        e.printStackTrace();
    }
}

