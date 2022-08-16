package exercicios.heranca;

public abstract class Animal {

    private String nome;
    private int idade;
    private String som;

    private String correr;
    public Animal(String nome, int idade, String som) {
        this.nome = nome;
        this.idade = idade;
        this.som = som;
    }
        public Animal(String nome, int idade, String som, String correr) {
            this.nome = nome;
            this.idade = idade;
            this.som = som;
            this.correr = correr;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSom() {
        return som;
    }

    public void setSom(String som) {
        this.som = som;
    }

    public String getCorrer() {
        return correr;
    }

    public void setCorrer(String correr) {
        this.correr = correr;
    }
}

/*
1- Crie uma hierarquia de classes conforme abaixo com os seguintes atributos e
comportamentos (observe a tabela), utilize os seus conhecimentos e distribua as
características de forma que tudo o que for comum a todos os animais fique na classe
Animal:
 */