package exercicios.orientacaoobjeto;

public class ClientPf extends Cliente{

    private String cpf;

    public ClientPf(String nome, String endereço, String cpf) {
        super(nome, endereço);
        this.cpf = cpf;

    }

    public String getCpf(){
        return cpf;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
}
