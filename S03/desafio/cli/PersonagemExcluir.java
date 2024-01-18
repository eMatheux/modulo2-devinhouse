package S03.desafio.cli;

import S03.desafio.Personagem;

import java.util.List;
import java.util.Scanner;

public class PersonagemExcluir {

    public static void excluirPersonagem(List<Personagem> personagemList) {
        System.out.println("Qual o nome do personagem que deseja excluir?");
        Scanner scanner = new Scanner(System.in);
        String nome = scanner.nextLine();
        for(Personagem personagem : personagemList) {
            if(personagem.getNome().equalsIgnoreCase(nome)) {
                personagemList.remove(personagem);

            }
        }

        System.out.println("Personagem excluido com sucesso.");

    }
}
