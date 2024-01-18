package S03.desafio.cli;

import S03.desafio.Personagem;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class PersonagemExportar {

    public static void exportarPersonagem(String nomeArquivo, List<Personagem> personagemList) throws IOException {
        Path path = Paths.get(nomeArquivo);
        Files.deleteIfExists(path);
        Files.createFile(path);
        for(Personagem personagem : personagemList) {
            String linha = personagem.toString() + "\n";
            Files.writeString(path, linha, StandardOpenOption.APPEND);
        }
        System.out.println("Personagem(s) exportados para o arquivo : " + nomeArquivo);
    }
}
