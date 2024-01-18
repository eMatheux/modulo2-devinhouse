package S02.ex6;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TestePerfilDeSaude {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" ** CADASTRO PERFIL DE SAUDE ** ");
        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scanner.nextLine();
        System.out.println("Digite seu sexo: ");
        String sexo = scanner.nextLine();
        System.out.println("Digite o dia de nascimento: ");
        int dia = scanner.nextInt();
        System.out.println("Digite o mes de nascimento: ");
        int mes = scanner.nextInt();
        System.out.println("Digite o ano de nascimento: ");
        int ano = scanner.nextInt();
        System.out.println("Digite a sua altura em metros: ");
        float altura = scanner.nextFloat();
        System.out.println("Digite seu peso em KG");
        int peso = scanner.nextInt();
        PerfilDeSaude perfilDeSaude = new PerfilDeSaude(nome, sobrenome, sexo, dia, mes, ano, altura, peso);
        perfilDeSaude.getRelatorio();
    }
}
