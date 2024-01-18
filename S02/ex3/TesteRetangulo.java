package S02.ex3;

public class TesteRetangulo {

    public static void main(String[] args) {

        Retangulo retanguloPadrao = new Retangulo();
        System.out.println(retanguloPadrao.getPerimetro());
        System.out.println(retanguloPadrao.getArea());

        //Testando metodo setLargura com valor maior que 20
        //OBS: O valor padrão do retagulo é 1 portanto ele retornará 1
        retanguloPadrao.setLargura(23);
        System.out.println(retanguloPadrao.getLargura());

        //Testando valor menor que 20 e maior que zero
        retanguloPadrao.setLargura(15);
        System.out.println(retanguloPadrao.getLargura());

        //Criando um novo retangulo com valores que eu quero
        Retangulo retanguloNovo = new Retangulo(15, 15);
        System.out.println(retanguloNovo.getLargura() + " " + retanguloNovo.getComprimento());
        System.out.println(retanguloNovo.getPerimetro());
        System.out.println(retanguloNovo.getArea());
    }
}
