package S02.ex2;

public class TestePessoaFisica {

    public static void main(String[] args) {
        PessoaFisica pessoa = new PessoaFisica(
                "Eder",
                "57448592840",
                68,
                "Hetero",
                7,
                8,
                2005);

        System.out.println(" ** PESSOA ** " +
                "\nNome: " + pessoa.getNome() +
                "\nCpf: " + pessoa.getCpf() +
                "\nPeso: " + pessoa.getPeso() + "kg" +
                "\nGênero: " + pessoa.getGenero() +
                "\nData de Nascimento: " + pessoa.getDataNascimento()
        );
    }
}
