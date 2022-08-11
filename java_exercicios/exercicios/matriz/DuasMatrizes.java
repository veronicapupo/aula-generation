package exercicios.matriz;

import java.util.Scanner;

public class DuasMatrizes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float[][] mA = new float[2][2];
        float[][] mB = new float[2][2];
        float[][] mC = new float[2][2];
        int menu = 0, numero;

        for (int i = 0; i < mA.length; i++) {
            for (int j = 0; j < mA[0].length; j++) {
                System.out.println("\nEntre com o número da mA: ");
                mA[i][j] = scan.nextFloat();
                System.out.println("\nEntre com o número da mB: ");
                mB[i][j] = scan.nextFloat();
            }
        }
        do {
            System.out.println("\nDigite : \n1- Para somar as duas matrizes \n2- Para subtrair a primeira matriz da segunda \n3- Para adicionar uma constante as duas matrizes \n4- Para imprimir as matrizes \n0-Sair");
            menu = scan.nextInt();

                          switch (menu) {
                    case 1:
                    for (int i = 0; i < mA.length; i++){
                        for (int j = 0; j < mA[0].length; j++) {
                            mC[i][j] = mA[i][j] + mB[i][j];
                            System.out.println("\nSoma: " + mC[i][j]);
                        }}
                        break;


                        case 2:
                            for ( int i = 0; i < mA.length; i++) {
                                for (int j = 0; j < mA[0].length; j++) {
                                    mC[i][j] = mA[i][j] - mB[i][j];
                                    System.out.println("\nA Subtração das matrizes é: " + mC[i][j]);
                                } }
                                break;

                                case 3:
                                    System.out.println("\nLeia um número: ");
                                    numero = scan.nextInt();
                                    for (int i = 0; i < 2; i++) {
                                        for (int j = 0; j < 2; j++) {
                                            mA[i][j] += numero;
                                            mB[i][j] += numero;
                                            System.out.println("\nMatriz1 mais o número: " + mA[i][j]);
                                            System.out.println("\nMatriz2 mais o número: " + mB[i][j]);
                                        }
                                    }
                                    break;

                                case 4:
                                    for (int i = 0; i < 2; i++) {
                                        for (int j = 0; j < 2; j++) {
                                            System.out.println("\nMatriz1: " + mA[i][j]);
                                            System.out.println("\nMatriz2: " + mB[i][j]);
                                        }
                                    }
                                    break;

                                case 0:
                                    System.out.println("\nMuito obrigado por utilizar o nosso programa!!!");
                                    break;

                                default:
                                    System.out.println("\nOpção inválida!!!");

                    }
            }while  (menu != 0) ;

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