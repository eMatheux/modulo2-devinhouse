package S03.desafio.cli;

import S03.desafio.Personagem;

import java.util.List;

public class PersonagemListar {

    public static void listar(List<Personagem> personagemList) {

        System.out.println("** LISTA DE PERSONAGENS **");
        System.out.println("-------------------------------------------------");
        for(Personagem personagem : personagemList) {
            System.out.println("Nome do personagem: " + personagem.getNome());
            System.out.println("Série do personagem: " + personagem.getSerie());
            System.out.println("-------------------------------------------------");
        }
    }
}
