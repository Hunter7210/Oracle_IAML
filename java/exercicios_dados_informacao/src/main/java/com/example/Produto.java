package com.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Produto
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Produto {

    //atributos
    private int id;
    private String nome;
    private double preco;

}