package S03.ex5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Principal {

    public static void main(String[] args) throws IOException {
        Path megasenaArquivo = Paths.get("megasena.csv");
        List<String> lines = Files.readAllLines(megasenaArquivo);
        System.out.println(lines.get(0));
        List<Concurso> concursos = new ArrayList<>();

        for(int i = 0; i < lines.size(); i++) {
            String[] splited = lines.get(i).split(",");
            int numero = Integer.valueOf(splited[0]);
            int ano = Integer.valueOf(splited[1].split("/")[2]);
            int mes = Integer.valueOf(splited[1].split("/")[1]);
            int dia = Integer.valueOf(splited[1].split("/")[0]);
            LocalDate data = LocalDate.of(ano, mes, dia);
            int[] sorteados = new int[8];
            int index = 0;
            for(int x = 2; x <= 7; x++ ) {
                sorteados[index] = Integer.parseInt(splited[x]);
                index++;
            }
            Concurso concurso = new Concurso(numero, data, sorteados);
            concursos.add(concurso);
        }

        concursos.forEach(s -> System.out.println(s.getData()));
        System.out.println(concursos.size());

    }
}
