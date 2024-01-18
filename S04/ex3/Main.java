package S04.ex3;

public class Main {

    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.valor = 100;
        produto.valorImposto = 50.0;
        System.out.println(produto.calcularValorComposto());
    }
}
