package exercicios.orientacaoobjeto.cadastro_cliente;

public class Pessoa {

        private int codigo;
         private String nome;

         public Pessoa(int codigo, String nome){
             this.codigo = codigo; /*atributos da classe*/
             this.nome = nome;
        }
        public int getCodigo(){
             return codigo;
        }
        public void setCodigo(int codigo){
             this.codigo = codigo;
        }

        public  String getNome(){
             return nome;
        }
        public void setNome(String nome){
             this.nome = nome;
        }


    }

