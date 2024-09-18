public class App {
    public static void main(String[] args) {
        // Inicializa a cadeia de Markov com um estado inicial (por exemplo, ENSOLARADO)
        CadeiaMarkovSimples cadeia = new CadeiaMarkovSimples(CadeiaMarkovSimples.CHUVOSO);

        // Número de dias a simular
        int numeroDeDias = 10;
        
        // Simula a transição de estados para o número especificado de dias
        for (int dia = 0; dia < numeroDeDias; dia++) {
            // Exibe o estado atual
            System.out.println("Dia " + (dia + 1) + ": " + cadeia.obterEstadoAtual());
            // Realiza a transição para o próximo dia
            cadeia.transicaoProximoDia();
        }
    }
}
