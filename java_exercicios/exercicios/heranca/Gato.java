package exercicios.heranca;

public class Gato extends Animal {
    public Gato(String nome, int idade, String som) {
        super(nome, idade, som);
    }

    @Override
    public void emitirSom() {
        System.out.println("\nGato faz " + this.getSom());
    }
}