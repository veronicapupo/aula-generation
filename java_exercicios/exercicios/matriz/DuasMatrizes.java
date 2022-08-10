package exercicios.matriz;

import java.util.Scanner;

public class DuasMatrizes {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[][] mA = new double[2][2];
        double[][] mB = new double[2][2];
        int menu = 0;
        double soma, subtracao;

        for (int i = 0; i < ; i++) {
            for (int j = 0; j <; j++) {

                System.out.println("\nEntre com o número da mA: ");
                int numero = scan.nextInt();
                mA[i][j] = numero;

                System.out.println("\nEntre com o número da mB: ");
                int numerob = scan.nextInt();
                mB[i][j] = numerob;

            }

            System.out.println("\nDigite : \n1- Para somar as duas matrizes \n2- Para subtrair a primeira matriz da segunda \n3- Para adicionar uma constante as duas matrizes \n4- Para imprimir as matrizes");
//            menu = scan.nextInt();

//            switch (menu) {
//                case 1:
//                    soma = mA[i][j] + mB[i][j];
//                    System.out.println("\nA somas das matrizes é: " + soma);
//                    break;
//
//                case 2:
//                    subtracao = mA[i][j] - mB[i][j];
//                    System.out.println("\nA Subtração das matrizes é: " + subtracao);
//
//                case 4:
//                    System.out.println("\nMatriz1: " + mA + "Matriz2:" + mB);
//            }

        }
    }
}
/*
	4- Faça um programa que leia duas matrizes 2 x 2 com valores reais. Ofereça ao usuário um menu de opções:
	(1) somar as duas matrizes
	(2) subtrair a primeira matriz da segunda
	(3) adicionar uma constante as duas matrizes
	(4) imprimir as matrizes
	Nas duas primeiras opções uma terceira matriz 2 x 2 deve ser criada. Na terceira opção o valor da constante deve ser lido e o resultado da adição da constante deve ser armazenado na própria matriz.

	 */