package S01;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int number = scanner.nextInt();
        System.out.println(number % 2 == 0 ? "Número é par" : "Número impar");
    }
}
