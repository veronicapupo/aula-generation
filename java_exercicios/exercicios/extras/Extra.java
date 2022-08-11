package exercicios.extras;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Extra {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int NUMBER = scan.nextInt();
        int horastrabalhadas = scan.nextInt();
        double valorHora = scan.nextDouble();
        double SALARY = (horastrabalhadas * valorHora);
        System.out.println("NUMBER = "+NUMBER);
        System.out.println(String.format("SALARY = %.2f" ,SALARY));

    }
}


/*

1-Leia A+B, armazene na C,Imprima.
public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        int x = (A + B);
        System.out.println("X = " +x);

2-- Efetue o cálculo da área, elevando o valor de raio ao quadrado e multiplicando por π.
        Scanner scan = new Scanner(System.in);
        double raio = scan.nextDouble();
        double n = 3.14159;
        double area = (n * Math.pow(raio,2));
       System.out.println(String.format("A=%.4f", area));
    }
3-Leia dois valores inteiros, no caso para variáveis A e B. A seguir, calcule a soma entre elas e atribua à variável SOMA. A seguir escrever o valor desta variável;
     Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        int SOMA = A + B;
        System.out.println("SOMA = "+SOMA);

4-Leia dois valores inteiros. A seguir, calcule o produto entre estes dois valores e atribua esta operação à variável PROD. A seguir mostre a variável PROD com mensagem correspondente;
      Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int PROD = n1 * n2;
        System.out.println("PROD = "+PROD);

5-Leia quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D);
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();
        int D = scan.nextInt();
        int DIFERENCA = (A * B - C * D) ;
        System.out.println("DIFERENCA = "+DIFERENCA);

6-Escreva um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas decimais;
        Scanner scan = new Scanner(System.in);
        int NUMBER = scan.nextInt();
        int horastrabalhadas = scan.nextInt();
        double valorHora = scan.nextDouble();
        double SALARY = (horastrabalhadas * valorHora);
        System.out.println("NUMBER = "+NUMBER);
        System.out.println(String.format("SALARY = %.2f" ,SALARY));

 */