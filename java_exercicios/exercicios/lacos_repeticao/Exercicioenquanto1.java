package exercicios.lacos_repeticao;

import java.util.Scanner;

public class Exercicioenquanto1 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valorEntrada = 1;
        double soma = 0;
        double media = 0;
        int contador = 0;
        while (valorEntrada >= 0) {
            valorEntrada = scanner.nextInt();
            if (valorEntrada >= 0) {
                soma += valorEntrada;
            }
            contador++;
        }

        media = soma / contador;
        System.out.println("Total do somatório: " + soma);
        System.out.println("A média é: " + media);
        System.out.println("Total de valores lidos: " + contador);
    }
}
