package exercicios.heranca;

public class Preguica extends Animal{

    private String escalar;

    public Preguica(String nome, int idade, String som, String escalar) {
        super(nome, idade, som);
        this.escalar = escalar;
    }

    public String getEscalar() {
        return escalar;
    }

    public void setEscalar(String escalar) {
        this.escalar = escalar;
    }
}
