import java.util.Random;

/**
 * Exerc1
 */
public class Exerc1 {
    Random rd = new Random();

    double falha = 0;
    int falhatipo1 = 0;
    int falhatipo2 = 0;
    int falhatipo3 = 0;
    int cust = 100;
    int qtdFal = 0;
    int qtdDias = 0;

    public void realizarCalculo(int prazo) {

        for (int i = 1; i < prazo; i++) {
            System.out.println("Dia: " + i);
            double rand = rd.nextDouble(0, 1);

            System.out.println("Range " + rand);/*
                                                 * System.out.println("Falha " + falha);
                                                 */

            if (rand > falha) {
                falha += 0.33;
            } else {
                /* cust += 100; */
                falha = 0;
                if (rand < 0.33) {
                    cust += 100;
                    falhatipo1 += 1;
                } else if (rand > 0.33 && rand < 0.66) {
                    cust += 200;
                    falhatipo2 += 1;
                } else {
                    falhatipo3 += 1;
                    cust += 300;
                }

                qtdFal+=1;
            }
            qtdDias+=1;
            
        }
        /* falha += 1; */
        System.out.println("O numero de dias é " + qtdDias);
        System.out.println("O numero de falhas é " + qtdFal);
        System.out.println("O numero de falhas do tipo 1 é " + falhatipo1);
        System.out.println("O numero de falhas do tipo 2 é " + falhatipo2);
        System.out.println("O numero de falhas do tipo 3 é " + falhatipo3);

        System.out.println("O custo total é " + cust);

    }

}