package S03.ex3;

public class Contador {

    public static void contarPalavras(String frase) {
        int tamanhoSemEspacos = frase.replace(" ", "").length();
        int tamanhoComEspacos = frase.length();
        System.out.println(" ** CONTADOR DE NÚMERO DE PALAVRAS ** \nNúmeros de palavras sem espaços: " + tamanhoSemEspacos + "\nNúmero de palavras com espaço: " + tamanhoComEspacos);
    }
}
