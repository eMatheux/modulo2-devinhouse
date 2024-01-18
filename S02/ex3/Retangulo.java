package S02.ex3;

public class Retangulo {

    float comprimento;
    float largura;

    public Retangulo() {
        comprimento = 1;
        largura = 1;

    }

    public Retangulo(float comprimento, float largura) {
        this.comprimento = comprimento;
        this.largura = largura;
    }

    public float getComprimento() {
        return comprimento;
    }

    public void setComprimento(float comprimento) {
        if(comprimento >= 0 && comprimento <=20) {
            this.comprimento = comprimento;
        } else {
            System.out.println("Erro valor não pode ser menor que 0 e maior que 20");
        }

    }

    public float getLargura() {
        return largura;
    }

    public void setLargura(float largura) {
        if(largura >= 0 && largura <=20) {
            this.largura = largura;
        } else {
            System.out.println("Erro valor não pode ser menor que 0 e maior que 20");
        }
    }

    public float getPerimetro() {
        return (comprimento * 2) + (largura * 2);
    }

    public float getArea() {
        return comprimento * largura;
    }
}
