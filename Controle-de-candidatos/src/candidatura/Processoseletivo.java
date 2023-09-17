package candidatura;
import java.util.concurrent.ThreadLocalRandom;

public class Processoseletivo {
    public static void main(String[] args) {
        selecaoCandidatos();
    }

    static void selecaoCandidatos() {
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULA", "AGUSTO", "MONICA", "FABRICIO", "MIRELA", "DAMIELA", "JOSE"};

        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;

        while(candidatosSelecionados < 5){
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou este valor: " + salarioPretendido);

            if(salarioPretendido <= salarioBase){
                System.out.println("O candidato " + candidato + " foi selecionado.");
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }
    }

    static double valorPretendido() {
        // Gera um valor aleatório entre 1500.0 (inclusive) e 2500.0 (exclusive)
        return ThreadLocalRandom.current().nextDouble(1500.0, 2500.0);
    }
}