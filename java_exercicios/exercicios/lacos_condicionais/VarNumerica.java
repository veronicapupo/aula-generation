package exercicios.lacos_condicionais;

import java.util.Scanner;

public class VarNumerica {
    public static void main (String[]args) {
        double numero;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        numero = scan.nextDouble();

        if(numero>100){
            System.out.println("Numero: " + numero);
        }

        }
    }

