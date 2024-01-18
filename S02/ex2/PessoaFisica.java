package S02.ex2;

public class PessoaFisica {


    String nome;
    String cpf;
    int peso;
    String genero;
    int diaNascimento;
    int mesNascimento;
    int anoNascimento;

    public PessoaFisica(String nome, String cpf, int peso, String genero, int diaNascimento, int mesNascimento, int anoNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.peso = peso;
        this.genero = genero;
        this.diaNascimento = diaNascimento;
        this.mesNascimento = mesNascimento;
        this.anoNascimento = anoNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDiaNascimento() {
        return diaNascimento;
    }

    public void setDiaNascimento(int diaNascimento) {
        this.diaNascimento = diaNascimento;
    }

    public int getMesNascimento() {
        return mesNascimento;
    }

    public void setMesNascimento(int mesNascimento) {
        this.mesNascimento = mesNascimento;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public String getDataNascimento() {
        return diaNascimento + "/" + mesNascimento + "/" + anoNascimento;
    }
}
