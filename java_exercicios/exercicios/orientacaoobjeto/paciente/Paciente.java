package exercicios.orientacaoobjeto.paciente;

public class Paciente {


    private String nome;
    private int idade;
    private String sintomas;
    private String diagnostico;

    public Paciente(String nome, int idade, String sintomas, String diagnostico) {
        this.nome = nome;
        this.idade = idade;
        this.sintomas = sintomas;
        this.diagnostico = diagnostico;
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

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }
    public void visualizar(){
        System.out.println("***************************************************************");
        System.out.println("\nDados do paciente");
        System.out.println("\nNome do paciente: " + this.nome);
        System.out.println("\nIdade do paciente: " + this.idade);
        System.out.println("\nSintomas do paciente: " + this.sintomas);
        System.out.println("\nDiagnóstico: " + this.diagnostico);
    }
}






























/*
7) Crie uma classe paciente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto paciente, defina as instancias deste
objeto e apresente as informações deste objeto no console.
 */