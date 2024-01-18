package S04.superherois.model;

public abstract class Personagem {

    private String nome;
    private String superPoder;

    public Personagem(String nome, String superPoder) {
        this.nome = nome;
        this.superPoder = superPoder;
    }
}
