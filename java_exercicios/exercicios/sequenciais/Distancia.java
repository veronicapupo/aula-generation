package exercicios.sequenciais;

import java.util.Scanner;

public class Distancia {

    public static void main (String[] args){
       double x1, x2, y1, y2, d;
       Scanner scan = new Scanner(System.in);
        System.out.println("\nEntre com o valor de x1: ");
        x1 = scan.nextDouble();
        System.out.println("\nEntre com o valor de x2: ");
        x2 = scan.nextDouble();
        System.out.println("\nEntre com o valor de y1: ");
        y1 = scan.nextDouble();
        System.out.println("\nEntre com o valor de y2: ");
        y2 = scan.nextDouble();

        d = Math.sqrt(Math.pow((x2-x1), 2.0))+ Math.pow((y2-y1), 2.0) , 2.0;);
        System.out.println("\nDistancia entre dois pontos foi de: " + Math.round(d,2.0) );


    }
}
