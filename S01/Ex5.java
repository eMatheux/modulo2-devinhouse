package S01;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira sua 1° nota");
        double nota1 = scanner.nextDouble();
        System.out.println("Insira sua 2° nota");
        double nota2 = scanner.nextDouble();
        System.out.println("Insira sua 3° nota");
        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.println("Sua média final é " + String.format("%,.2f", media));
    }
}
