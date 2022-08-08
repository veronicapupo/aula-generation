package exercicios.lacos_condicionais;

import java.util.Scanner;

public class Categoria {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int idade = scan.nextInt();

        if((idade>=10) && (idade<=14)){
            System.out.println("Infantil");
        }
        if((idade>=15) && (idade<=17)){
            System.out.println("Juvenil");
        }
        if((idade>=18) && (idade<=25)){
            System.out.println("Adulto");
        }
    }
}


/*
Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
categoria ela se encontra:
 10-14 infantil
 15-17 juvenil
 18-25 adulto
 */