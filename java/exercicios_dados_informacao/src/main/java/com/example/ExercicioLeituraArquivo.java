package com.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//Lendo um arquivo de texto com Java
public class ExercicioLeituraArquivo {
    // Arquivos de entrada e saída
    String inputFile = "alunos_notas.txt";

    // Lista para armazenar
    List<Aluno> alunos = new ArrayList<>();
    double somaTotalNotas = 0; // Soma total das médias de
    int totalAlunos = 0; // Contator de alunos

    public void app() {

        try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
            String linha;
            // Loop criado para verificar se ao ler a linha ela não esta nula, se for igual
            // a null o codigo para
            while ((linha = br.readLine()) != null) {
                String[] partes = linha.split(",");
                if (partes.length < 2) {
                    System.out.println("Linha com formato incorreto: " + linha);
                    continue;
                }

                String nome = partes[0];
                double somaNotas = 0;
                int numeroNotas = 0;

                try {

                    for (int i = 1; i < partes.length; i++) {
                        somaNotas += Double.parseDouble(partes[i]);
                        numeroNotas++;
                    }
                } catch (NumberFormatException e) {
                    somaNotas += 0;
                }

                double media = somaNotas / numeroNotas;
                alunos.add(new Aluno(nome, media));
                somaTotalNotas += media;
                totalAlunos++;

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        Aluno alunoMaiorNota = alunos.get(0);
        Aluno alunoMenorNota = alunos.get(0);
    
        //Foreach
        //Percorre a lista de alunos para encontrar o de maior e menor
        for (Aluno aluno : alunos) {
            if (aluno.getMedia() > alunoMaiorNota.getMedia()) {
                alunoMaiorNota = aluno;
            }
            if (aluno.getMedia() < alunoMenorNota.getMedia()) {
                alunoMenorNota = aluno;
            }
        }
        double mediaGeralTurma = somaTotalNotas / totalAlunos; //Calcula a media geral
        
        System.out.println("");
        System.out.println("Aluno com a maior nota: "+ alunoMaiorNota.getNome() + " - Média: " + alunoMaiorNota.getMedia());
        System.out.println("Aluno com a menor nota: "+ alunoMenorNota.getNome() + " - Média: " + alunoMenorNota.getMedia());
        System.out.println("Media geral da turma: " + mediaGeralTurma);
    }
}
