package S02.exerciciosAula;

import java.util.Scanner;

public class ExExtra03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua primeira nota: ");
        double nota1 = scanner.nextDouble();
        System.out.println("Digite sua segunda nota: ");
        double nota2 = scanner.nextDouble();
        System.out.println("Digite sua terceira nota: ");
        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.println("Sua media é: " + String.format("%.2f", media));
        System.out.println(media > 7 ? "Você foi aprovado!" : "Você foi reprovado :(");

    }
}
