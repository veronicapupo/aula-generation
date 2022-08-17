package exercicios.revisao;

import java.math.BigDecimal;

public class Vendedor extends Trabalhador{

    private int numero;

     public Vendedor(Long id, String nome, BigDecimal salario, int numero) {
        super(id, nome, salario);
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public void aumentarSalario(float percentual) {

            float salarioNovo = 1 + ((percentual) / 100);
            BigDecimal aumento = new BigDecimal(salarioNovo);
            this.setSalario(aumento);

        }


    public void visualizar(){
        super.visualizar();
        System.out.println("\n NUMERO DO TRABALHADOR: " + this.getNumero());
    ;
    }
}
