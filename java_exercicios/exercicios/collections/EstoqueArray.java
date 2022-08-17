package exercicios.collections;

import java.util.*;
import java.util.Collections;

public class EstoqueArray {

    public static void main(String[] args) {
        List<String> estoque = new ArrayList<>();

        estoque.add("Vestido azul");
        estoque.add("Vestido rosa");
        estoque.add("Vestido verde");
        estoque.add("Vestido coral");

        System.out.println(estoque);
        estoque.set(estoque.indexOf("Vestido verde"), "Vestido coral");
        estoque.remove((estoque.get(2)));
        System.out.println(estoque);
        System.out.println(Collections.max(estoque));
    }
}


/*
3- Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
trabalhar com Collection do tipo List do Java para manipular os dados desse estoque, o
programa deverá atender as seguintes funcionalidades:
Armazenar dados da List
Remover dados da list;
Atualizar dados da list.
Apresentar todos os dados da list.
 */