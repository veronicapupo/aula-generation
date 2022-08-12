package exercicios.orientacaoobjeto.paciente;

public class Prontoario {

    public static void main(String[]args) {


         Paciente paciente01 = new Paciente("Carla", 20,"febre","gripe");
         Paciente paciente02 = new Paciente("Horacio", 55, "dor de cabeca", "sinusite");
         paciente01.visualizar();
         paciente02.visualizar();
         paciente01.setDiagnostico("covid");
         System.out.println("\nDiagnostico atualizado: " + paciente01.getDiagnostico());
    }
}
