package S03.exerciciopratico;

import java.time.LocalDate;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Personagem personagem = new Personagem();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual vai ser o nome do personagem?");
        String nome = scanner.nextLine();
        personagem.setNome(nome);
        System.out.println("Qual é a referencia do personagem? (Série ou Filme");
        String referencia = scanner.nextLine();
        personagem.setReferemcia(referencia);
        System.out.println("Qual é a idade do personagem?");
        int idade = scanner.nextInt();
        personagem.setIdade(idade);
        LocalDate data = LocalDate.now();
        personagem.setData(data);
        System.out.println(personagem.obterNomeEmMaiusculo());
        System.out.println(personagem.obterTresPrimeirasLetrasDoNome());
        System.out.println(personagem);
    }
}
