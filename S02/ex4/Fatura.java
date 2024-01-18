package S02.ex4;

public class Fatura {
    String numeroFatura;
    String descricaoFatura;
    int quantidadeDeItens;
    double precoItem;

    public Fatura(String numeroFatura, String descricaoFatura, int quantidadeDeItens, double precoItem) {
        this.numeroFatura = numeroFatura;
        this.descricaoFatura = descricaoFatura;
        this.quantidadeDeItens = quantidadeDeItens;
        this.precoItem = precoItem;
    }

    public String getNumeroFatura() {
        return numeroFatura;
    }

    public void setNumeroFatura(String numeroFatura) {
        this.numeroFatura = numeroFatura;
    }

    public String getDescricaoFatura() {
        return descricaoFatura;
    }

    public void setDescricaoFatura(String descricaoFatura) {
        this.descricaoFatura = descricaoFatura;
    }

    public int getQuantidadeDeItens() {
        return quantidadeDeItens;
    }

    public void setQuantidadeDeItens(int quantidadeDeItens) {
        this.quantidadeDeItens = quantidadeDeItens;
    }

    public double getPrecoItem() {
        return precoItem;
    }

    public void setPrecoItem(double precoItem) {
        this.precoItem = precoItem;
    }

    public double getValorFatura() {
        return quantidadeDeItens > 0 && precoItem > 0? quantidadeDeItens * precoItem : 0;
    }

}
