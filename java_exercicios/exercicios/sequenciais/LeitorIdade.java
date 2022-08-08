package exercicios.sequenciais;

import java.util.Scanner;

public class LeitorIdade {

    public static void main (String[]args) {

        Scanner scan = new Scanner(System.in);
        int idade, meses, dias;
        System.out.println("Digite sua idade: ");
        idade = scan.nextInt();
        System.out.println("Digite quantos meses: ");
        meses = scan.nextInt();
        System.out.println("Digite quantos dias: ");
        dias = scan.nextInt();

        dias += ((idade * 12) * 30) + (meses * 30);
        System.out.println("Idade em dias: " + dias);
    }
}
