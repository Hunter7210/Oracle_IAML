public class ArvoreBinariaFilmes {
    private Filme raiz;
    
    public void adicionarFilme(String titulo, int ano, String genero, double nota) {
        raiz = adicionarRecursivo(raiz,titulo, ano, genero, nota);
    }

    public  void adicionarRecursivo(Filme atual, String titulo, int ano, String genero, double nota) {
        if (atual == null) {
            return new Filme(titulo, ano, genero, nota)
        }

        if (titulo.compareTo(atual.titulo)<0) {
            atual.esquerda = adicionarRecursivo(atual, titulo, ano, genero, nota);
        } else if (titulo.compareTo(atual.titulo)>0){
            atual.direita = adicionarRecursivo(atual.direita, titulo, ano, genero, nota);
        } else {System.out.println("Falha");

        }
    }
}
