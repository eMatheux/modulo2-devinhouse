package S03.desafio.cli;

import S03.desafio.utils.ConverterOpcao;
import S03.desafio.utils.MenuOperecao;

import java.util.Scanner;

public class PersonagemCLI {

    public void exibirMenu() {
        System.out.println(" ** CADASTRO DE PERSONAGEM ** " +
                "\n1. Incluir personagem " +
                "\n2. Excluir personagem " +
                "\n3. Listar personagem " +
                "\n4. Exportar personagem para um arquivo " +
                "\n0. Fechar programa");
    }

    public MenuOperecao obterOpcao() {
        System.out.println("Qual opção deseja selecionar?");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        return ConverterOpcao.converter(i);
    }

    public void aguardar() {
        System.out.println("Pressione alguma tecla para continuar a navegar...");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        System.out.println();
    }
}
