package S03.ex1;

public class Funcionario {

    String cpf;
    String nomeCompleto;
    float salario;

    public Funcionario(String cpf, String nomeCompleto, float salario) {
        this.cpf = cpf;
        this.nomeCompleto = nomeCompleto;
        this.salario = salario;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public void promover(float percentual) {
        setSalario(salario + salario * percentual);

    }
}
