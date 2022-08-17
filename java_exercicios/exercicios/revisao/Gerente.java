package exercicios.revisao;

import java.math.BigDecimal;

public class Gerente extends Trabalhador{

    private int setor;

    public Gerente(Long id, String nome, BigDecimal salario, int setor) {
        super(id, nome, salario);
        this.setor = setor;
    }

    public int getSetor() {
        return setor;
    }

    public void setSetor(int setor) {
        this.setor = setor;
    }

    @Override
    public void aumentarSalario(float percentual) {

        float bonus = 20;
        float salarioNovo = 1 + ((percentual + bonus) / 100);
        BigDecimal aumento = new BigDecimal(salarioNovo);
        this.setSalario(aumento);
        System.out.println("\nValor do aumento " + salarioNovo);

    }
    public void visualizar(){
        super.visualizar();
        System.out.println("\n SETOR DO TRABALHADOR: " + this.getSetor());

    }
}
