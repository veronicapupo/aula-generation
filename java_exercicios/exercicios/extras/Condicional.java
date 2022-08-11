package exercicios.extras;

import java.util.Scanner;

public class Condicional {

    public static void main(String[]args){

        Scanner scan = new Scanner(System.in);

        double livroJava;
        double livroC;
        System.out.println("\nEntre com o preço do livro de Java:");
        livroJava = scan.nextDouble();
        System.out.println("\nEntre com o preço do livro de C:");
        livroC = scan.nextDouble();
        double total = livroJava + livroC;
        System.out.println("\nO preço toral é: " + total);


        if (livroC == 10) {
            System.out.println("Livro de C quase de graça!\n");
        }

        if (total <= 120.00) {
            System.out.println("\nO preço está bom!");
        }
        else {
            System.out.println("Livro muito caro!");
        }
        if (livroJava < livroC) {
            System.out.println("\nLivro de Java mais barato");
        }
        else if (livroJava > livroC) {
            System.out.println("\nLivro C mais barato");
        }
        else{
            System.out.println("\nLivros com o mesmo preço");
        }

}

}