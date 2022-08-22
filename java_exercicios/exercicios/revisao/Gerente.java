package exercicios.revisao;

import java.math.BigDecimal;
import java.text.DecimalFormat;

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

        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);

        BigDecimal aumento = new BigDecimal((percentual + bonus) / 100);
        aumento = aumento.multiply(this.getSalario());
        this.setSalario(this.getSalario().add(aumento));
        System.out.println("\nNovo salário: " + df.format(getSalario()));
    }
    public void visualizar(){
        super.visualizar();
        System.out.println("\n SETOR DO TRABALHADOR: " + this.getSetor());

    }
}
