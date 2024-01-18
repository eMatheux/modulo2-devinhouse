package S04.ex1;

public class ContaConcorrente extends Conta implements Operavel{

    @Override
    public void depositar(double valor) {
        this.saldo = saldo + valor;
    }

    @Override
    public void sacar(double valor) {
        this.saldo = saldo - valor;
    }
}
