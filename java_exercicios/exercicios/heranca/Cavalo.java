package exercicios.heranca;

public class Cavalo extends Animal {

    public Cavalo(String nome, int idade, String som, String correr) {
        super(nome, idade, som, correr);
    }

    @Override
    public void emitirSom() {
        System.out.println("\n Cavalo faz " + this.getSom());
    }
}
