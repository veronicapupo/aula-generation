package exercicios.orientacaoobjeto;

public class ClienteApp {

    public static void main(String[]args){

        ClientPf clientepf1 = new ClientPf("xxx","bairro tal","11212");

        ClientePj clientepj1 = new ClientePj("xx1x","bairro tal","1121256");

        System.out.println("Cliente pf dados: " +clientepf1.getNome() + " " + clientepf1.getEndereço());

    }
}
