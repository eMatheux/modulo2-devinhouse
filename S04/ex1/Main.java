package S04.ex1;

public class Main {

    public static void main(String[] args) {
        ContaConcorrente contaConcorrente = new ContaConcorrente();
        contaConcorrente.depositar(100);
        System.out.println(contaConcorrente.saldo);
        contaConcorrente.sacar(50);
        System.out.println(contaConcorrente.saldo);

    }
}
