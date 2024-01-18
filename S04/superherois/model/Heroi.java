package S04.superherois.model;

public class Heroi extends Personagem{
    private String nomeVidaReal;

    public Heroi(String nome, String superPoder, String nomeVidaReal) {
        super(nome, superPoder);
        this.nomeVidaReal = nomeVidaReal;
    }
}
