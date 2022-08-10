package exercicios.lacos_repeticao;

import java.util.Scanner;

public class Caracteristicas {
    public static void main (String[]args){
        int idade, genero, fatorps, contadorCalmas =0, contadornervosas=0, contadoragressivos=0, contadorCalmos =0, contpessoascalmasmenos18 =0, contadornervmais40=0;
        int p =1;

        Scanner scan = new Scanner(System.in);
        while(p<=3) {
            System.out.println("\nQual sua idade: ");
            idade = scan.nextInt();
            System.out.println("\nQual seu genero?:\n1- Feminino \n 2-Masculino \n 3-outros");
            genero = scan.nextInt();
            System.out.println("\nQual seu fator pscologico: \n1- calma \n2-nervosa \n3-agressiva");
            fatorps = scan.nextInt();

            if(fatorps==1) {
                contadorCalmas++;
            }
            if(genero ==1 && fatorps ==2) {
                contadornervosas++;
            }
            if(genero== 2 && fatorps ==3){
                contadoragressivos++;
            }
            if(genero == 3 && fatorps ==1){
                contadorCalmos++;
            }
            if(fatorps ==2 && idade>40){
                contadornervmais40++;
            }
            if(fatorps ==1 && idade <18){
                contpessoascalmasmenos18++;
            }
            p++;
        } System.out.println("\nNúmero de pessoas calmas: ");
        System.out.println("\nNúmero de mulheres nervosas: ");
        System.out.println("\nNúmero de homens agressivos:");
        System.out.println("\nNÚmero de pessoas outtos calmas:");
        System.out.println("\nNúmero de pessoas nervosas com mais de 40 anos: ");
        System.out.println("\nNúmero de pessoas calmas com menos de 18 anos:");

    }
}
/*
Uma empresa desenvolveu uma pesquisa para saber as características
psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre: (WHILE)
 o número de pessoas calmas;
 o número de mulheres nervosas;
 o número de homens agressivos;
 o número de outros calmos;
 o número de pessoas nervosas com mais de 40 anos;
 o número de pessoas calmas com menos de 18 anos.
 */