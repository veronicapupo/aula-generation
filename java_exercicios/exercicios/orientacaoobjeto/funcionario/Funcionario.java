package exercicios.orientacaoobjeto.funcionario;

public class Funcionario {

    private String nome;
    private String funcao;
    private String turno;
    private int matricula;

    public Funcionario(String nome, String funcao, String turno, int matricula) {
        this.nome = nome;
        this.funcao = funcao;
        this.turno = turno;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void imprimir(){
        System.out.println("\nNome do funcionario: " + this.nome);
        System.out.println("\nCargo do funcionario: " + this.funcao);
        System.out.println("\nTurno do funcionario: " + this.turno);
        System.out.println("\nNúmero matricula funcionario: " + this.matricula);
    }
}

/*
4) Crie uma classe funcionário e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto funcionário, defina as
instancias deste objeto e apresente as informações deste objeto no
console.
 */