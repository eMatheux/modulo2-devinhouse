package S01;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" ** CALCULADORA DE PA OU PG ** ");
        System.out.println("Digite o valor inicial: ");
        int valorInicial = scanner.nextInt();
        System.out.println("Digite o valor da raiz: ");
        int raiz = scanner.nextInt();
        System.out.println("Escolha se será uma PA ou uma PG \nDigite 1 para PA \nDigite 2 para PG");
        String tipo = scanner.next();
        int index = 0;
            switch (tipo) {
                case "1":
                    for (int i = valorInicial; index < 10; i+=raiz) {
                        index++;
                        System.out.println(i);
                    }
                    break;
                case "2":
                    for (int i = valorInicial; index < 10; i*=raiz) {
                        index++;
                        System.out.println(i);
                    }
                    break;
                default:
                    System.out.println("Opção incorreta, tente novamente.");
                    scanner.next();
            }
        scanner.close();
    }
}
