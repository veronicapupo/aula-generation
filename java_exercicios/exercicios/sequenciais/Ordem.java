package exercicios.sequenciais;

import java.util.Scanner;

public class Ordem {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1, n2, n3;
        System.out.println("\nEntre com um número Inteiro: ");
        n1 = scan.nextInt();
        System.out.println("\nEntre com um número Inteiro: ");
        n2 = scan.nextInt();
        System.out.println("\nEntre com um número Inteiro: ");
        n3 = scan.nextInt();

        if (n1 <= n2 && n2 <= n3) {
            System.out.println("\nOrdem crescente: " + n1 + ", " + n2 + ", " + n3);
        } else if (n1 <= n3 && n3 <= n2) {
            System.out.println("\nOrdem crescente: " + n1 + ", " + n3 + ", " + n2);
        } else if (n2 <= n1 && n1 <= n3) {
            System.out.println("\nOrdem crescente: " + n2 + ", " + n1 + ", " + n3);
        } else if (n2 <= n3 && n3 <= n1) {
            System.out.println("\nOrdem crescente: " + n2 + ", " + n3 + ", " + n1);
        } else if (n3 <= n1 && n1 <= n2) {
            System.out.println("\nOrdem crescente: " + n3 + ", " + n1 + ", " + n2);
        } else {
            System.out.println("\nOrdem crescente: " + n3 + ", " + n2 + ", " + n1);
        }
    }
}