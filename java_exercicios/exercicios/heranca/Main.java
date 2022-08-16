package exercicios.heranca;

public class Main {

    public static void main(String[] args) {

        Animal cavalo = new Cavalo("Pé de pano", 5, "Relinchando", "corre");
        Animal preguica = new Preguica("Zé", 2, "ZZZZzzzz", "escala");
        Animal cachorro = new Cachorro("Mayka", 3, "AU-AU", "corre");
        Animal gato = new Gato("leia", 5, "miau-miau");

        cavalo.emitirSom();
        preguica.emitirSom();
        cachorro.emitirSom();
        gato.emitirSom();
    }
}
