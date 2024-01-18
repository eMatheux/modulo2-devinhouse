package S02.exerciciosAula;

import java.util.Scanner;

public class ExExtra01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maiorValor = 0;
        System.out.println("Digite o primeiro valor ");
        int primeiroNumero = scanner.nextInt();
        if(primeiroNumero > maiorValor) {
            maiorValor = primeiroNumero;
        }
        System.out.println("Digite o primeiro valor ");
        int segundoNumero = scanner.nextInt();
        if(segundoNumero > maiorValor) {
            maiorValor = segundoNumero;
        }
        System.out.println("Digite o primeiro valor ");
        int terceiroNumero = scanner.nextInt();
        if(terceiroNumero > maiorValor) {
            maiorValor = terceiroNumero;
        }

        System.out.println("Maior valor entre os 3 números é: " + maiorValor);

    }
}
