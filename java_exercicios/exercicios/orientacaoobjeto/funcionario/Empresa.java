package exercicios.orientacaoobjeto.funcionario;

public class Empresa {


    public static void main(String[]args){


        Funcionario funcionario01 = new Funcionario("Rita", "Secretaria", "Manhã", 55555);
        Funcionario funcionario02 = new Funcionario("Ricardo", "Corretor", "Tarde", 63541);

        funcionario02.setFuncao("Administraçao");
        System.out.println("Cargo atualizado: " + funcionario02.getFuncao());

        funcionario01.imprimir();
        funcionario02.imprimir();
    }
}
