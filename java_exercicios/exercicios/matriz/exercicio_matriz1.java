package exercicios.matriz;

import java.util.Scanner;

public class exercicio_matriz1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int LINHA = 3;
        final int COLUNA = 2;

        double  n1[][] = new double[LINHA][COLUNA],
                n2[][] = new double[LINHA][COLUNA],
                m1[][] = new double[LINHA][COLUNA],
                m2[][] = new double[LINHA][COLUNA];

        for (int i = 0; i < n1.length; i++) {
            for (int j = 0; j < n1[0].length; j++) {
                System.out.println("Entre com o valor da N1 : ");
                n1[i][j] = scanner.nextInt();
                System.out.println("Entre com o valor da N2 : ");
                n2[i][j] = scanner.nextInt();

                m1[i][j] = n1[i][j] + n2[i][j];
                m2[i][j] = n1[i][j] - n2[i][j];

            }
        }
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[0].length; j++) {
                System.out.println("Valor M1:" + m1[i][j]);
                System.out.println("Valor M2: " + m2[i][j]);
            }

        }

    }
}
