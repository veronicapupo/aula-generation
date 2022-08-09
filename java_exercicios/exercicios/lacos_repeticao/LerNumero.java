package exercicios.lacos_repeticao;

import java.util.Scanner;

public class LerNumero {
    public static void main (String[]args){
        Scanner scan = new Scanner(System.in);
        int numero =0;
        int par,impar, quantidadePar = 0, quantidadeImpar =0;

        for (numero =0; numero<=10; numero++) {
            System.out.println("Digite um número: ");
             numero = scan.nextInt();

             if (numero % 2 ==0){
                 System.out.println("Numero par: " + numero);
                 quantidadePar++;
             }
             else{
                 System.out.println("Numero impar: " + numero);
                 quantidadeImpar++;
             }
            System.out.println("Quantidade de numeros pares: " + quantidadePar);
            System.out.println("Quantidade de numeros imoares: " + quantidadeImpar);
        }

    }
}


