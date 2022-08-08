package exercicios.lacos_condicionais;

import java.util.Scanner;

public class CalcularArea {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        double base, altura;
        System.out.println("Programa que calcula a area do triangulo.");
        System.out.println("Digite o valor da base: ");
        base = scan.nextDouble();
        System.out.println("Digite o valor da altura: ");
        altura = scan.nextDouble();

        if(base>0 && altura>0) {
            System.out.println("Area do triangulo: " + (base * altura) / 2);
        }
    }
}
