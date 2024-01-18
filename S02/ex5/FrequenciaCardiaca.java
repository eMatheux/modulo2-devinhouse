package S02.ex5;

public class FrequenciaCardiaca {
    String nome;
    String sobrenome;
    int diaNascimento;
    int mesNascimento;
    int anoNascimento;

    public FrequenciaCardiaca(String nome, String sobrenome, int diaNascimento, int mesNascimento, int anoNascimento) {
        this.nome = nome;
        this.sobrenome = sobrenome;
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

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
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

    public int getIdade() {
        return 2023 - anoNascimento;
    }

    public float getFrequenciaCardiacaMax() {
        return 220 - getIdade();
    }

    public String getFrequenciaCardicaAlvo() {
        float frequencia = getFrequenciaCardiacaMax();
        float frequenciaAlvo2 = (float) (frequencia * 0.85);
        return "Sua frequencia alvo está entre " + frequencia / 2 + " e " + frequenciaAlvo2 + "";
    }
}
