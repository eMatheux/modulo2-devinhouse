package S03.desafio.utils;

public class ConverterOpcao {

    public static MenuOperecao converter (int n) {
        MenuOperecao opcao = null;
        switch(n) {
            case 1:
                opcao = MenuOperecao.INCLUIR;
                break;
            case 2:
                opcao =  MenuOperecao.EXCLUIR;
                break;
            case 3:
                opcao =  MenuOperecao.LISTAR;
                break;
            case 4:
                opcao =  MenuOperecao.EXPORTAR;
                break;
            case 0:
                opcao = MenuOperecao.SAIR;
                break;

        }
        return opcao;
    }
}
