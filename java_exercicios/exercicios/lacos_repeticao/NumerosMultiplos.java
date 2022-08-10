package exercicios.lacos_repeticao;

import java.util.Scanner;

public class NumerosMultiplos {

    public static void main(String[] args) {

        int numero, soma = 0, quantidadeNum = 0;
        float mediaMult = 0;
        Scanner scan = new Scanner(System.in);


        do {
            System.out.println("\nDigite um número: ");
            numero = scan.nextInt();
            if (numero == 0) {
                System.out.println("\nNúmero Invalido");
            } else {
                if (numero % 3 == 0) {
                    soma += numero;
                    quantidadeNum++;
                }
            }
        }
        while (numero != 0);
        if (quantidadeNum == 0) {
            System.out.println("\nNão é possivel fazer divisao por zero!");
        }else{

                quantidadeNum++;
                soma = soma + numero;
                mediaMult = soma / quantidadeNum;
            }
        System.out.println("\nMédia dos números múltiplos de 3:" + mediaMult);
           }


        }


/*
Escrever um programa que receba vários números inteiros no teclado. E no
final imprimir a média dos números múltiplos de 3. Para sair digitar
0(zero).(DO...WHILE)
 */


