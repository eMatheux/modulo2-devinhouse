package S01;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" ** REAJUSTE DE SALÁRIO ** ");
        System.out.println("Digite o valor do salário: ");
        double salario = scanner.nextDouble();
        double salarioPosAumento = 0;
        double percentual = 0.0;
        double valorDoAumento = 0;

        if(salario <= 1200) {
            percentual = 20.0 / 100.0;
            salarioPosAumento = salario + (percentual * salario);
            valorDoAumento = salarioPosAumento-salario;
        } else if( salario > 1200 && salario <=1700) {
            percentual = 15.0 / 100.0;
            salarioPosAumento = salario + (percentual * salario);
            valorDoAumento = salarioPosAumento-salario;
        } else if ( salario > 1700 && salario < 2500) {
            percentual = 10.0 / 100.0;
            salarioPosAumento = salario + (percentual * salario);
            valorDoAumento = salarioPosAumento-salario;
        } else {
            percentual = 5.0 / 100.0;
            salarioPosAumento = salario + (percentual * salario);
            valorDoAumento = salarioPosAumento-salario;
        }

        System.out.println(" ** RELATORIO FINAL ** ");
        System.out.println("Salário antes do reajuste: " + salario);
        System.out.println("Foi aplicado um percentual de: " + percentual * 100 + "%");
        System.out.println("Valor do aumento: " + valorDoAumento);
        System.out.println("Novo salário R$" + salarioPosAumento);
    }
}
