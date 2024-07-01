package candidatos;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        System.out.println("Processo seletivo");
        selecaoCandidatos();

    }

    // metodo nao utilizado???
    static void analisarCnadidato(double salario) {
        double salarioBase = 2000.0;

        if (salarioBase > salario) {
            System.out.println("Ligar para o candidato.");
        } else if (salarioBase < salario) {
            System.out.println("Liagar para o candiato com a contra proposta.");
        } else {
            System.out.println("Aguardando o resultado dos demais candidatos.");
        }
    }

    // metodo principal
    static void selecaoCandidatos() {
        String[] candidatos = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j" };
        List<String> candidatosAprovados = new ArrayList<>();
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretenido();

            System.out.println("O candidato" + candidato + " solicitou este valor de salário: " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("candidato " + candidato + " foi selecionado para a vaga.");
                candidatosAprovados.add(candidato);
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
        System.out.println("Candidatos aprovados: " + candidatosAprovados);

        for (String candidatoAprovado : candidatosAprovados) {
            entrandoEmContao(candidatoAprovado);
        }
    }

    // metodo auxiliar
    static double valorPretenido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    // metodo auxiliar
    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }

    // metodo auxiliar
    static void entrandoEmContao(String candidato) {
        int tentativaRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if(!atendeu && tentativaRealizadas==3){
                System.out.println("Contato sem sucesso com o candidato "+candidato+" sendo feito "+tentativaRealizadas+" tentativas");
            }
            if(continuarTentando){
                tentativaRealizadas++;
            }else{
                System.out.println("Contato realizado com sucesso com o candidato "+candidato+" sendo feito "+tentativaRealizadas+" tentativas");
            }

            
        } while (continuarTentando && tentativaRealizadas <= 3);
    }
}
