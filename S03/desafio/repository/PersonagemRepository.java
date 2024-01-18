package S03.desafio.repository;

import S03.desafio.Personagem;

import java.util.ArrayList;
import java.util.List;

public class PersonagemRepository {

    List<Personagem> personagens = new ArrayList<>();

    public List<Personagem> getListaPersonagens() {
        return personagens;
    }

    public void remove(Personagem personagem) {
        personagens.remove(personagem);
    }
}
