package exercicios.heranca;

public class Preguica extends Animal {

    private String escalar;

    public Preguica(String nome, int idade, String som, String escalar) {
        super(nome, idade, som);
        this.escalar = escalar;
    }

    @Override
    public void emitirSom() {
        System.out.println("\n Preguica faz : " + this.getSom());
    }

    public String getEscalar() {
        return escalar;
    }

    public void setEscalar(String escalar) {
        this.escalar = escalar;
    }
}
