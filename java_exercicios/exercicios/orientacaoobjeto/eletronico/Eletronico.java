package exercicios.orientacaoobjeto.eletronico;

public class Eletronico {

    private String categoria;
    private String modelo;
    private int valor;

    public Eletronico(String categoria, String modelo, int valor) {
        this.categoria = categoria;
        this.modelo = modelo;
        this.valor = valor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}
