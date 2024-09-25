package main.java.com.example;

public class Decisao {
    
    // Função para construir a árvore de decisão
    public static No construirArvore() {
        // Criação da árvore de decisão com base em sintomas
        No raiz = new No("Febre");

        // Nó com valor "Sim" para o sintoma Febre
        No febreSim = new No("Tosse");
        febreSim.adicionarFilho("Sim", new No("Tosse", "Gripe"));
        febreSim.adicionarFilho("Não", new No("Tosse", "Resfriado"));
        
        // Nó com valor "Não" para o sintoma Febre
        No febreNao = new No("Dor de Garganta");
        febreNao.adicionarFilho("Sim", new No("Dor de Garganta", "Resfriado"));
        febreNao.adicionarFilho("Não", new No("Dor de Garganta", "Nenhuma"));
       
        // Nó com valor "Sim" para o sintoma fadiga
        No fadigaSim = new No("Fadiga");
        febreNao.adicionarFilho("Sim", new No("Fadiga", "Resfriado"));
        febreNao.adicionarFilho("Não", new No("Fadiga", "Nenhuma"));
       
        // Nó com valor "Não" para o sintoma fadiga
        No fadigaNao = new No("Dores no Corpo");
        febreNao.adicionarFilho("Sim", new No("Dores no Corpo", "Resfriado"));
        febreNao.adicionarFilho("Não", new No("Dores no Corpo", "Nenhuma"));
       
        // Adiciona os nós filhos à raiz
        raiz.adicionarFilho("Sim", febreSim);
        raiz.adicionarFilho("Não", febreNao);
        raiz.adicionarFilho("Sim", fadigaSim);
        raiz.adicionarFilho("Não", fadigaNao);

        return raiz;
    }

}