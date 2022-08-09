package exercicios.lacos_repeticao;


import java.util.Scanner;

public class LeitorNumeros {
    public static void main(String[]args){

        int numero, somaNumeros=0;

        do {
            Scanner scan = new Scanner(System.in);
            System.out.println("\nDigite um número: ");
            numero = scan.nextInt();
            somaNumeros += numero;
        }
        while(numero != 0);
        System.out.println("\nA soma dos números é: " + somaNumeros);
    }

}
/*
Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados.(DO...WHILE)
 */