package S04.superherois.cli;

public class Display {

    public void menu() {
        System.out.println("1. Cadastrar Heroi");
        System.out.println("2. Cadastrar Vilao");
        System.out.println("3. Listar");
        System.out.println("4. Sair");
    }

    public void getMessageError() {
        System.out.println("Ocorreu um erro! Por favor tente novamente.");
    }
}
