package S03.desafio;

public class Personagem {

    private String nome;
    private String serie;

    public Personagem(String nome, String serie) {
        this.nome = nome;
        this.serie = serie;
    }

    @Override
    public String toString() {
        return "Personagem{" +
                "nome='" + nome + '\'' +
                ", serie='" + serie + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }
}
