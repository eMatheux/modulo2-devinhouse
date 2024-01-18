package S01;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();
        System.out.println("Digite seu peso agora em KG");
        int peso = scanner.nextInt();
        double imc = peso / (altura * altura);

        System.out.println("Seu IMC é: "  + String.format("%,.2f", imc));
    }
}
