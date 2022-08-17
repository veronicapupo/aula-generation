package exercicios.extras;

import java.util.Optional;

public class Optional10 {

    public static void main(String[] args) {

        String[] palavras = new String[10];

        palavras[5] = "Turma 57 é top";
        Optional<String> checaNulo = Optional.ofNullable(palavras[5]);


        if (checaNulo.isPresent()) {
            String palavra = palavras[5].toLowerCase();
            System.out.println(palavra);
        } else {
            System.out.println("\nA palavra é nula!");

        }
        System.out.println(checaNulo.isEmpty());
        System.out.println(checaNulo.get());
        System.out.println(checaNulo);
    }
}