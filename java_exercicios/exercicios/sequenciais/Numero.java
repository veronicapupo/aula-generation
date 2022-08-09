package exercicios.sequenciais;

import java.util.Scanner;

public class Numero {


    /*
    Faça um programa que receba três inteiros e diga qual deles é o maior.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com um número inteiro: ");
        int n1 = scan.nextInt();
        System.out.println("Entre com um número inteiro: ");
        int n2 = scan.nextInt();
        System.out.println("Entre com um número inteiro: ");
        int n3 = scan.nextInt();
        int maiorNumero = 0;
        if (maiorNumero < n1) {
            maiorNumero = n1;
        }
        if (maiorNumero < n2) {
            maiorNumero = n2;
        }
        if (maiorNumero < n3) {
            maiorNumero = n3;

        }
        System.out.println("\nO maior número é: " + maiorNumero);

        /* Resolução usando for com 3 interações
         *
         *    int maiorNota = 0;
         *    for (int i = 0; i < 3; i++) {
         *        int nota = scan.nextInt();
         *        if (nota > maiorNota) {
         *            maiorNota = nota;
         *        }
         *    }
         *    System.out.println("\nO maior número é: " + maiorNota);
         */
    }
}
