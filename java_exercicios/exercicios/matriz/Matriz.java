package exercicios.matriz;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        int somaTotalMatriz = 0;
        int somaDiagonal = 0;
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[0].length; y++) {
                matriz[x][y] = scan.nextInt();
                somaTotalMatriz += matriz[x][y];
            }
        }

        for (int x = 0; x < matriz.length; x++) {
            somaDiagonal += matriz[x][x];
        }
        System.out.println("soma total da matriz :" + somaTotalMatriz);
        System.out.println("soma da diagonal principal :" + somaDiagonal);

        System.out.println(matriz.length);
        System.out.println(matriz[0].length);
    }
}