package devinhouse.apinews.controller;
import devinhouse.apinews.model.Jornalista;
import devinhouse.apinews.services.JornalistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jornalista")
public class JornalistaController {

    @Autowired
    private JornalistaService jornalistaService;

    @GetMapping
    public List<Jornalista> listarJornalistas() {
        return jornalistaService.getAllJournalist();
    }

    @PostMapping
    public Jornalista criarJornalista(@RequestBody Jornalista jornalista) {
        return jornalistaService.saveJournalist(jornalista);
    }

    @GetMapping("/{id}")
    public Jornalista obterJornalistaPorId(@PathVariable Long id) {
        return jornalistaService.getJournalistById(id);
    }

    @PutMapping("/{id}")
    public Jornalista atualizarJornalista(@PathVariable Long id, @RequestBody Jornalista jornalista) {
        if (jornalistaService.getJournalistById(id) != null) {
            jornalista.setId(id);
            return jornalistaService.saveJournalist(jornalista);
        } else {
            return null;
        }
    }

    @DeleteMapping("/{id}")
    public void deletarJornalista(@PathVariable Long id) {
        jornalistaService.deleteJournalist(id);
    }
}
