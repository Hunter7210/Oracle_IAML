/**
 * Filme
 */
public class Filme {

    String titulo;
    int ano;
    String genero;
    double nota;
    Filme esquerda;
    Filme direita;

    Filme(String titulo, int ano, String genero, double nota, Filme esquerda, Filme direita) {
        this.titulo = titulo;
        this.ano = ano;
        this.genero = genero;
        this.nota = nota;
        this.esquerda = null;
        this.direita = null;
    }

}