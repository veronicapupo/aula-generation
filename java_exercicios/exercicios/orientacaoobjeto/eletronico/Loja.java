package exercicios.orientacaoobjeto.eletronico;

import java.util.Scanner;

public class Loja {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o tipo de eletronico, modelo e valor");

        Eletronico eletronico1 = new Eletronico(scan.next(), scan.next(), scan.nextInt());
        Eletronico eletronico2 = new Eletronico(scan.next(), scan.next(), scan.nextInt());

        eletronico1.imprimir();
        eletronico2.imprimir();
    }
}
