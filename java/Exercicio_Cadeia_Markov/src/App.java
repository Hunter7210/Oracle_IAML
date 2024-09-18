import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero de dias:");
        int prazo = sc.nextInt();

        Exerc1 ex = new Exerc1();
        ex.realizarCalculo(prazo);
        sc.close();
    }
}
