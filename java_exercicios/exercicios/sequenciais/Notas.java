package exercicios.sequenciais;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Notas {
    public static void main(String[]args){

        double n1, n2, n3, media;
        double p1 = 2.0, p2 = 3.0, p3 = 5.0;
        double pesototal = (p1+p2+p3);

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor da primeira nota: ");
        n1 = scan.nextDouble();
        System.out.println("Digite o valor da segunda nota: ");
        n2 = scan.nextDouble();
        System.out.println("Digite o valor da terceira nota: ");
        n3 = scan.nextDouble();

        media = ((n1 * p1) + (n2 * p2) + (n3 * p3)) / pesototal;
        System.out.println("\nMédia: " + media);
    }
}

/*
 e calcule a média final deste aluno. Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5, respectivamente.
 */