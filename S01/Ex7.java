package S01;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("** CALCULADORA **");
        System.out.println("Digite o primeiro número: ");
        double primeiroNumero = scanner.nextDouble();
        System.out.println("Digite o segundo número: ");
        double segundoNumero = scanner.nextDouble();
        System.out.println("E agora a operação que deseja fazer \n° Digite '+' caso deseje somar \n° Digite '-' caso deseje subtrair \n° Digite '*' caso deseje multiplicar \n° Digite '/' caso deseje dividir");
        String operacao = scanner.next();
        double resultado = 0;
        switch (operacao){
            case "+":
                resultado = primeiroNumero + segundoNumero;
                break;
            case "-":
                resultado = primeiroNumero - segundoNumero;
                break;
            case "*":
                resultado = primeiroNumero * segundoNumero;
                break;
            case "/":
                resultado = primeiroNumero / segundoNumero;
                break;
            default:
                System.out.println("Essa operação não existe");

        }

        System.out.println("Resultado da operação é: " + resultado);
    }
}
