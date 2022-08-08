package exercicios.vetores;

import java.util.Scanner;

public class Vetor {

            public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            double vetor[] = new double[5];
            double maiorValor = 0.0;
            for (int i = 0; i < vetor.length; i++) {
                vetor[i] = scan.nextDouble();
                System.out.println(vetor[i]);
                if (maiorValor < vetor[i]) {
                    maiorValor = vetor[i];
                }
            }
            System.out.println("Maior valor : " + maiorValor);
        }
    }

