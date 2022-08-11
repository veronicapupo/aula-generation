package exercicios.orientacaoobjeto;

public class Cliente {

    private String nome;
    private String endereço;

    public Cliente(String nome, String endereço){
        this.nome = nome;
        this.endereço = endereço;
    }
    public String getNome(){
        return nome;
    }
    public String getEndereço(){
        return endereço;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setEndereço(String endereço){
        this.endereço = endereço;
    }
}
