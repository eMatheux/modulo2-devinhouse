package S02.ex4;

public class TesteFatura {

    public static void main(String[] args) {

        //Criando uma fatura com valor correto para retornar o valor da fatura multiplicando a quantidadeItens pelo preço de cada
        Fatura fatura = new Fatura("01" , "Compra realizada no dia 01/04/2023", 10, 15.95);
        System.out.println("R$" + fatura.getValorFatura());

        //Criando uma fatura onde o valor da quantidade de itens é 0 assim o valor da fatura deve retornar 0
        Fatura fatura1 = new Fatura("02", "Compra realizada no dia 01/05/2023", 0, 15.95);
        System.out.println("R$" + fatura1.getValorFatura());
        //Fazendo o mesmo com o preço do item
        fatura1.setQuantidadeDeItens(1);
        fatura1.setPrecoItem(0);
        System.out.println("Número da fatura: #" + fatura1.getNumeroFatura());
        System.out.println(fatura1.getDescricaoFatura());
        System.out.println("Quantidade de itens: " + fatura1.getQuantidadeDeItens());
        System.out.println("Preço por item: R$" + fatura1.getPrecoItem());
        System.out.println("Valor fatura: R$" + fatura1.getValorFatura());
    }
}
