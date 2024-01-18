package devinhouse.apinews.services;

import devinhouse.apinews.model.Noticia;
import devinhouse.apinews.repository.NoticiaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoticiaService {

    @Autowired
    private NoticiaRepository noticiaRepository;

    public List<Noticia> getAllNews() {
        return noticiaRepository.findAll();
    }

    public Noticia saveNews(Noticia noticia) {
        return noticiaRepository.save(noticia);
    }

    public Noticia getNewsById(Long id) {
        return noticiaRepository.findById(id).orElse(null);
    }

    public void deleteNews(Long id) {
        noticiaRepository.deleteById(id);
    }
}
