package S02.exerciciosAula;

import java.util.Scanner;

public class ExExtra04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua primeira nota: ");
        double nota1 = scanner.nextDouble();
        if(nota1 > 10) return;
        System.out.println("Digite sua segunda nota: ");
        double nota2 = scanner.nextDouble();
        if(nota2 > 10) return;
        System.out.println("Digite sua terceira nota: ");
        double nota3 = scanner.nextDouble();
        if(nota3 > 10) return;
        System.out.println("Digite numero de faltas: ");
        int faltas = scanner.nextInt();
        int diasIdos = 200 - faltas;
        double media = (nota1 + nota2 + nota3) / 3;
        double frequencia = (diasIdos / 200.0) * 100.0;
        System.out.println(media > 7 && frequencia > 75 ? "Você foi aprovado parabéns!" : "Você foi reprovado!");




    }
}
