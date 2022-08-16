package exercicios.heranca;

public class Cachorro extends Animal{

    private String correr;

    public Cachorro(String nome, int idade, String som, String correr) {
        super(nome, idade, som, correr);
    }

    @Override
    public void emitirSom() {
        System.out.println("\n Cachorro faz : "+ this.getSom() );
    }
}
