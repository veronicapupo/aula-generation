package exercicios.orientacaoobjeto;

public class PessoaApp {

    public static void main(String[]args) {

        Pessoa pessoa1 =new Pessoa(1,"José");
        Pessoa pessoa2 =new Pessoa(2,"Lucas");

        System.out.println("O nome do objeto pessoa 1 é: "+pessoa1.getNome());

        pessoa1.setNome("Jose");
        System.out.println("O nome é: "+pessoa1.getNome());
    }
}
