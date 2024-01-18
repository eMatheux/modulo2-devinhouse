package S02.ex5;

public class TesteFrequenciaCardiaca {

    public static void main(String[] args) {
        FrequenciaCardiaca pessoa = new FrequenciaCardiaca("Eder Matheus", "Condori Arcaya", 7, 8, 2005);

        System.out.println(pessoa.getIdade());
        System.out.println(pessoa.getFrequenciaCardiacaMax());
        System.out.println(pessoa.getFrequenciaCardicaAlvo());
    }
}
