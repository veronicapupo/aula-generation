package exercicios.revisao;

import java.math.BigDecimal;

public abstract class Trabalhador {

    private Long id;
    private String nome;
    private BigDecimal salario;

    public Trabalhador(Long id, String nome, BigDecimal salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }
    public abstract void aumentarSalario(float percentual);

    public void visualizar(){
        System.out.println("\n ID DO TRABALHADOR: " + this.getId());
        System.out.println("\n NOME DO TRABALHADOR: " + this.getNome());
        System.out.println("\nSALARIO: " + this.getSalario());
    }
}
