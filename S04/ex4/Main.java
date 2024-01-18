package S04.ex4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade;
            System.out.println("Qual sua idade?");
            idade = scanner.nextInt();
            if (idade > 100 || idade <= 0) {
                throw new IdadeInvalidaException("Idade inválida, tente novamente");
            }
            System.out.println("Olá, você tem " + idade + " anos de idade!");
    }
}
