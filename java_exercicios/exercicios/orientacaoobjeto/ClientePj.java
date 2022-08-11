package exercicios.orientacaoobjeto;

public class ClientePj extends Cliente{
   private String cnpj;

   public ClientePj(String nome, String endereco, String cnpj){
      super(nome,endereco);
      this.cnpj = cnpj;
   }
   public String getCnpj(){
      return cnpj;
   }
   public void setCnpj(String cnpj){
      this.cnpj = cnpj;
   }
}
