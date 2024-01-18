package S02.ex6;

public class PerfilDeSaude {
    String nome;
    String sobrenome;
    String sexo;
    int diaNascimento;
    int mesNascimento;
    int anoNascimento;
    double altura;
    int peso;

    public PerfilDeSaude(String nome, String sobrenome, String sexo, int diaNascimento, int mesNascimento, int anoNascimento, double altura, int peso) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.sexo = sexo;
        this.diaNascimento = diaNascimento;
        this.mesNascimento = mesNascimento;
        this.anoNascimento = anoNascimento;
        this.altura = altura;
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return 2023 - anoNascimento;
    }

    public float getFrequenciaCardiacaMax() {
        return 220 - getIdade();
    }

    public String getDataNascimento() {
        return diaNascimento + "/" + mesNascimento + "/" + anoNascimento;
    }


    public String getFrequenciaCardicaAlvo() {
        float frequencia = getFrequenciaCardiacaMax();
        float frequenciaAlvo2 = (float) (frequencia * 0.85);
        return "Sua frequencia alvo está entre " + frequencia / 2 + " e " + frequenciaAlvo2 + "";
    }

    public double getImc() {
        return peso / (Math.pow(altura, 2));
    }

    public void getRelatorio() {
        System.out.println(" ** RELATÓRIO ** " +
                "\nNome Completo: " + nome + " " + sobrenome +
                "\nSexo: " + sexo +
                "\nData de Nascimento: " + getDataNascimento() +
                "\nAltura (m): " + String.format("%.2f", getAltura()) +
                "\nPeso (kg): " + peso +
                "\nIdade: " + getIdade() +
                "\nFrequencia cardiaca máxima: " + getFrequenciaCardiacaMax() +
                "\n" + getFrequenciaCardicaAlvo() +
                "\nIMC: " + String.format("%.2f", getImc())
        );

    }
}
