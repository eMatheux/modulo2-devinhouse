package S03.desafio;

import S03.desafio.cli.*;
import S03.desafio.repository.PersonagemRepository;
import S03.desafio.utils.MenuOperecao;

import java.io.IOException;
import java.util.List;

public class AplicativoCriarPersonagem {
    private PersonagemCLI cli = new PersonagemCLI();
    private PersonagemRepository repository = new PersonagemRepository();
    MenuOperecao opcao;
    public void iniciar() throws IOException {
        do {
            cli.exibirMenu();
            opcao = cli.obterOpcao();
            processar(opcao);
        } while (opcao != MenuOperecao.SAIR);

    }
    private void processar (MenuOperecao opcao) throws IOException {
        List<Personagem> personagemList = repository.getListaPersonagens();
        if(opcao == null) {
            System.out.println("Erro! Opção inválida");
            cli.aguardar();
        } else if(opcao == MenuOperecao.INCLUIR) {
            PersonagemIncluir.adicionarPersonagem(personagemList);
            cli.aguardar();
        } else if(opcao == MenuOperecao.LISTAR) {
            PersonagemListar.listar(personagemList);
            cli.aguardar();
        } else if(opcao == MenuOperecao.EXCLUIR) {
            PersonagemExcluir.excluirPersonagem(personagemList);
            cli.aguardar();
        } else if(opcao == MenuOperecao.EXPORTAR) {
            PersonagemExportar.exportarPersonagem("personagem.txt", personagemList);
            cli.aguardar();
        }

    }
}
