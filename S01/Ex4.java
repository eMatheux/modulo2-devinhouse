package S01;

import java.util.Random;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adivinhe qual número de 1 a 5 eu estou pensando");
        int number = scanner.nextInt();
        if(number > 5) {
            System.out.println("Insira um número entre 1 e 5");
        } else {
            Random random = new Random();
            int randomNumber = random.nextInt(5 - 1) + 1;
            System.out.println(number == randomNumber ? "Você acertou! \nO número era " + randomNumber : "Você errou! \nO número era " + randomNumber);
        }
    }
}
