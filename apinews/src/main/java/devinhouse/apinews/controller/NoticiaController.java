package devinhouse.apinews.controller;

import devinhouse.apinews.model.Noticia;
import devinhouse.apinews.services.NoticiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/noticia")
public class NoticiaController {
    @Autowired
    private NoticiaService noticiaService;

    @GetMapping
    public List<Noticia> listarNoticias() {
        return noticiaService.getAllNews();
    }

    @PostMapping
    public Noticia criarNoticia(@RequestBody Noticia noticia) {
        return noticiaService.saveNews(noticia);
    }

    @GetMapping("/{id}")
    public Noticia obterNoticia(@PathVariable Long id) {
        return noticiaService.getNewsById(id);
    }

    @PutMapping("/{id}")
    public Noticia atualizarNoticia(@PathVariable Long id, @RequestBody Noticia noticia) {
        if (noticiaService.getNewsById(id) != null) {
            noticia.setId(id);
            noticia.setDataAtualizacao(new Date());
            return noticiaService.saveNews(noticia);
        } else {
            return null;
        }
    }

    @DeleteMapping("/{id}")
    public void deletarNoticia(@PathVariable Long id) {
        noticiaService.deleteNews(id);
    }
}

