package exercicios.matriz;

import java.util.Scanner;

public class MatrizQuantidade {

    public static void main (String[]args){

        Scanner scan = new Scanner(System.in);
        int [][] matriz = new int [3][3];
        int contador = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("\nDigite um número: ");
                int numero = scan.nextInt();
                if(numero > 10){
                    contador++;
            }
            }
        }
        System.out.println("\nQuantidade de valores > 10: " + contador);
         }
}
/*
3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.

 */