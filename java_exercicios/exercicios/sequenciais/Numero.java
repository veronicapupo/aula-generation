package exercicios.sequenciais;

import java.util.Scanner;

public class Numero {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com um número inteiro: ");
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int n3 = scan.nextInt();
        int maiorNumero = 0;
        if(maiorNumero<n1){
             maiorNumero = n1;
        }
        if(maiorNumero<n2){
            maiorNumero = n2;
        }
        if(maiorNumero<n3){
            maiorNumero = n3;

        }
        System.out.println("\nO maior número é: " + maiorNumero);
    }
}

/*
Faça um programa que receba três inteiros e diga qual deles é o maior.
 */