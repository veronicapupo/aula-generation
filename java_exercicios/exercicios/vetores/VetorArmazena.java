package exercicios.vetores;

import java.util.Scanner;

public class VetorArmazena {

    public static void main (String[]args){

    Scanner scan = new Scanner(System.in);

    int[] numeros = new int[6];
    int numero, contadorPar= 0, contadorImpar = 0;
    int somaPar = 0;

        for (int i = 0; i <6; i++) {
            System.out.println("\nDigite um número: ");
            numero = scan.nextInt();
            if (numero % 2 ==0){
                 somaPar += numero;
                System.out.println("\nNúmero par: " + numero);
            }
            else{
                System.out.println("\nNúmero impar: "+ numero );
                contadorImpar++;
            }
        }
        System.out.println("\nSoma dos números pares: " + somaPar);
        System.out.println("\nQuantidade de números impares: " + contadorImpar);
    }
}
/*
2- Faça um programa que receba 6 números inteiros e mostre:
• Os números pares digitados;
• A soma dos números pares digitados;
• Os números ímpares digitados;
• A quantidade de números ímpares digitados.

 */