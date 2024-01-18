package S03.desafio.cli;

import S03.desafio.Personagem;
import S03.desafio.repository.PersonagemRepository;

import java.util.List;
import java.util.Scanner;

public class PersonagemIncluir {

    public static void adicionarPersonagem(List<Personagem> personagemList) {
        System.out.println("Digite qual o nome do personagem que deseja adicionar? ");
        Scanner scanner = new Scanner(System.in);
        String nome = scanner.nextLine();
        System.out.println("Qual o nome da série do personagem? ");
        String serie = scanner.nextLine();
        Personagem personagem = new Personagem(nome, serie);
        personagemList.add(personagem);
        System.out.println("");
        System.out.println("Personagem criado com sucesso!");
    }
}
