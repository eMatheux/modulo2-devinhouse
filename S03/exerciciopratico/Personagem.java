package S03.exerciciopratico;


import java.time.LocalDate;

public class Personagem {
    private String nome;
    private String referemcia;
    private Integer idade;
    private LocalDate data;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getReferemcia() {
        return referemcia;
    }

    public void setReferemcia(String referemcia) {
        this.referemcia = referemcia;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Personagem{" +
                "nome='" + nome + '\'' +
                ", referemcia=" + referemcia +
                ", idade=" + idade +
                ", data=" + data +
                '}';
    }

    public String obterNomeEmMaiusculo() {
        return nome.toUpperCase();
    }

    public String obterTresPrimeirasLetrasDoNome() {
        return nome.replace(" ", "").substring(0, 3);
    }
}
