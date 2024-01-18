package S01;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat df1 = new java.text.SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Digite o dia do seu nascimento: ");
        int dia = scanner.nextInt();
        System.out.println("Digite o mes que você nasceu ");
        int mes = scanner.nextInt();
        System.out.println("Digite o ano que você nasceu: ");
        int ano = scanner.nextInt();
        Calendar dataDeNascimento = Calendar.getInstance();
        dataDeNascimento.set(ano, mes - 1, dia);
        Calendar rightNow = Calendar.getInstance();
        int mesAgora = rightNow.getTime().getMonth() + 1;
        int diaAtual = Integer.parseInt(String.valueOf(rightNow.get(Calendar.DAY_OF_MONTH)));
        int somaNascimento = dia + mes;
        int somaAtual = diaAtual + mesAgora;
        int anoAtual = rightNow.get(Calendar.YEAR);
        System.out.println(anoAtual);
        int idade = 0;

        //Verificando se usuário fez aniversário já ou não
        if(dia<=diaAtual && mes<=mesAgora) {
            idade = anoAtual - ano;
        } else {
            idade = (anoAtual - ano) - 1;
        }

        System.out.println( " ** RELATÓRIO FINAL ** ");
        System.out.println("Sua data de nascimento é: " + df1.format(dataDeNascimento.getTime()));
        System.out.println("Idade: " + idade);
        if ( idade >= 16 && idade<=17 || idade > 59) {
            System.out.println("Situação de voto: Opcional");
        } else if (idade >=18 && idade <= 59) {
            System.out.println("Situação de voto: Obrigatório ");
        } else {
            System.out.println("Situação de voto: Não Apto");

        }

    }
}
