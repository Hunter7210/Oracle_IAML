package com.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public  class Usuario {
    // Atributos
    private int id;
    private String nome;
    private int idade;
    private String cidade;

}
