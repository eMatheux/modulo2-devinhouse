package S04.ex3;

public class Produto implements Tributavel{

    double valor;
    double valorImposto;

    @Override
    public double calcularValorComposto() {
        return valor + valorImposto;
    }


}
