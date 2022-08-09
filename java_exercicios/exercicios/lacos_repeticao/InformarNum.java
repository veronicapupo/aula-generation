package exercicios.lacos_repeticao;

public class InformarNum {

    public static void main(String[]args){

        int n1 = 1000, n2 = 1999;

        for (n1=1000; n1<=1999; n1++){
            if(n1 % 11 ==5){
                System.out.println("\nNumeros que divididos por 11 obtemos o resto 5: "+ n1);
            }
        }
    }
}




/*
Informar todos os números de 1000 a 1999 que quando divididos por 11
obtemos resto = 5. (FOR)
 */