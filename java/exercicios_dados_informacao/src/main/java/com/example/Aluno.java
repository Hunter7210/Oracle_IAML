package com.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//Utilização do Lombok para facilitar
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Aluno {
    // Atributos
    private String nome;
    private double media;

}
