package exercicios.extras;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Aula {
    public static void main(String[] args) {

        int divisor = 0, dividendo = 0;
        Scanner scan = new Scanner(System.in);
        boolean loop = true;
        do {
            try {
                System.out.println("\nDigite o valor do dividendo: " + dividendo);
                dividendo = scan.nextInt();
                System.out.println("\nDigite o valor do divisor: " + divisor);
                divisor = scan.nextInt();

                dividir(dividendo, divisor);
                loop = false;
            } catch (ArithmeticException e) {
                // System.err.println("\nExceção: " + e);
                scan.nextLine();
                System.out.println("\nDigite valores inteiros positivos > 0");
            }catch(InputMismatchException e){
                    // System.err.println("\nExceção: " + e);
                    scan.nextLine();
                    System.out.println("\nDigite valores inteiros positivos >");

        } }while(loop);


    }

       public static void dividir (int dividendo, int divisor){
           System.out.println("Divisão = " + dividendo / divisor);
       }
}

//finally {sout("Tchau")}
//throws
//serialVersionUID