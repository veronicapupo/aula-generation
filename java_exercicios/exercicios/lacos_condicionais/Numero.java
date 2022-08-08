package exercicios.lacos_condicionais;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Numero {

    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("\nEntre com um número: ");
        int numero = scan.nextInt();

        boolean par = (numero % 2 ==0);

        if(par){
            System.out.println("Número Par: " + numero);
            System.out.println("Raiz quadrada: " + Math.sqrt(numero));
        }
        else{
            System.out.println("Número Impar: " + numero);
            System.out.println("Número elevado ao quadrado: " + Math.pow(numero,2));
        }


    }
}

