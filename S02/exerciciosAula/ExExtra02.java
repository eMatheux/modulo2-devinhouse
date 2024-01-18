package S02.exerciciosAula;

import java.util.Scanner;

public class ExExtra02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual departamento você deseja escolher?");
        System.out.println("Digite 1 caso a opção seja Depto Comercial");
        System.out.println("Digite 2 caso a opção seja Depto Financeiro");
        System.out.println("Digite 3 caso a opção seja Depto RH");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1 -> System.out.println("Você selecionou: Departamento Comercial");
            case 2 -> System.out.println("Você selecionou: Departamento Financeiro");
            case 3 -> System.out.println("Você selecionou: Departamento RH");
            default -> System.out.println("Opção incorreta");

        }

    }
}
