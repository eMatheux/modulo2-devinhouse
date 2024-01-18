package S03.ex2;

public class Funcionario {

    String nomeCompleto;
    float salario;

    public Funcionario(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public Funcionario(String nomeCompleto, float salario) {
        this.nomeCompleto = nomeCompleto;
        this.salario = salario;
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

    public void aumentar(float valor) {
        this.salario = salario + valor;
    }

    public void aumentar(float valor, float comissao) {
        this.salario = salario + valor + comissao;
    }
}
