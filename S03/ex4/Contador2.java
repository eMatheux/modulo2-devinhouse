package S03.ex4;

public class Contador2 {

    private String frase;

    public Contador2(String frase) {
        this.frase = frase;
    }

    public void contarPalavras() {
        int tamanhoSemEspacos = frase.replace(" ", "").length();
        int tamanhoComEspacos = frase.length();
        System.out.println(" ** CONTADOR DE NÚMERO DE PALAVRAS ** \nNúmeros de palavras sem espaços: " + tamanhoSemEspacos + "\nNúmero de palavras com espaço: " + tamanhoComEspacos);
    }
}
