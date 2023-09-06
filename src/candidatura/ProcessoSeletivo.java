package candidatura;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo{
    public static void main(String[] args){
     imprimirSelecionados();
    }

    static void imprimirSelecionados(){
        String[] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};
        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");
        for (int indice=0; indice < candidatos.length;indice++){
            System.out.println("O candidato de nº " + (indice+1) + " é o " + candidatos[indice]);
        }

        System.out.println("Forma abreviada de interacao for each");
        for(String candidato: candidatos){
            System.out.println("O candidato selecionado foi " + candidato);
        }

    }
    static void selecaoCandidatos(){
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
        
        int candidatosSelecionados = 0;
        int canditadosAtual=0;
        double salarioBase=2000.0;
        while(candidatosSelecionados <5 && canditadosAtual < candidatos.length){
            String candidato = candidatos[canditadosAtual];
            double salarioPredentido = valorPretendido();

            System.out.println("O candidato " + candidato + " Solicitou este valor de salário " + salarioPredentido);
            if(salarioBase >= salarioPredentido){
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga ");
                candidatosSelecionados++;
            }
            canditadosAtual++;

        }

    }
    // Método que simula o valor pretendido

static double valorPretendido() {
     return ThreadLocalRandom.current().nextDouble(1800, 2200);
}


    static void analisarCandidato(double salarioPredentido){
     double salarioBase = 2000.0;
     if(salarioBase > salarioPredentido){
        System.out.println("LIGAR PARA O CANDIDATO");
     }   else if (salarioBase==salarioPredentido)
     System.out.println("LIGAR PARA O CANDITADO COM CONTRA PROPOSTA");
     else{
        System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
     }
    }
}