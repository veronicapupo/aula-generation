package exercicios.sequenciais;

import java.util.Scanner;

public class Calculo {

    public static void main(String[] args) {

        int A, B, C;
        double D;

        Scanner scan = new Scanner(System.in);
        System.out.println("\nEntre com valor A: ");
        A = scan.nextInt();
        System.out.println("\nEntre com valor B: ");
        B = scan.nextInt();
        System.out.println("\nEntre com o valor C: ");
        C = scan.nextInt();

        D = (Math.pow((A + B), 2.0) + Math.pow((B + C), 2.0)) / 2;
        System.out.println("\n O valor de D é: " + D);

    }
}
