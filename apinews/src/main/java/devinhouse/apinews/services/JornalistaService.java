package devinhouse.apinews.services;

import devinhouse.apinews.model.Jornalista;
import devinhouse.apinews.repository.JornalistaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JornalistaService {

    @Autowired
    private JornalistaRepository jornalistaRepository;
    private static final Logger logger = LoggerFactory.getLogger(JornalistaService.class);

    public List<Jornalista> getAllJournalist() {
        logger.info("Obtendo todos os jornalista do nosso banco de dados");
        return jornalistaRepository.findAll();
    }

    public Jornalista saveJournalist(Jornalista jornalista) {
        logger.info("Salvando jornalista" + jornalista.getNome() + " no banco de dados");
        return jornalistaRepository.save(jornalista);
    }

    public Jornalista getJournalistById(Long id) {
        logger.info("Obtendo todos os jornalista de id" + id + " do nosso banco de dados");
        return jornalistaRepository.findById(id).orElse(null);
    }

    public void deleteJournalist(Long id) {
        jornalistaRepository.deleteById(id);
    }
}
