package S01;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual seu sobrenome?");
        String sobrenome = scanner.nextLine();
        System.out.println("Qual seu nome?");
        String nome = scanner.nextLine();
        String nomeCompleto = nome + " " + sobrenome;
        //int letters = sobrenome.replaceAll("\\s","").length() + nome.replaceAll("\\s","").length();
        int letters = sobrenome.length() + nome.length();

        System.out.println("Seu nome é: " + nomeCompleto);
        System.out.println("A quantidade de letras em seu nome é: " + letters);
    }
}
