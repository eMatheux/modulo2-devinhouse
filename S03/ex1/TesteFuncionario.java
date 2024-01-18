package S03.ex1;

public class TesteFuncionario {

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("57448592840", "Eder Matheus Condori Arcaya", 5990);
        System.out.println(funcionario.salario);
        //Salário para mais 5%
        funcionario.promover(0.05F);
        System.out.println(funcionario.salario);
    }
}
