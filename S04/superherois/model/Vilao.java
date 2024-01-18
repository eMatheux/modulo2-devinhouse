package S04.superherois.model;

public class Vilao extends Personagem{
    Integer tempoDePrisao;

    public Vilao(String nome, String superPoder, int tempoDePrisao) {
        super(nome, superPoder);
        this.tempoDePrisao = tempoDePrisao;
    }
}
