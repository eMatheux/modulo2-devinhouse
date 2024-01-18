package devinhouse.apinews.controller;

import devinhouse.apinews.model.Revisor;
import devinhouse.apinews.services.RevisorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/revisores")
public class RevisorController {

    @Autowired
    private RevisorService revisorService;

    @GetMapping
    public List<Revisor> listarRevisores() {
        return revisorService.getAllReviewers();
    }

    @PostMapping
    public Revisor criarRevisor(@RequestBody Revisor revisor) {
        return revisorService.saveReviewer(revisor);
    }

    @GetMapping("/{id}")
    public Revisor obterRevisorPorId(@PathVariable Long id) {
        return revisorService.getReviewer(id);
    }

    @PutMapping("/{id}")
    public Revisor atualizarRevisor(@PathVariable Long id, @RequestBody Revisor revisor) {
        if (revisorService.getReviewer(id) != null) {
            revisor.setId(id);
            return revisorService.saveReviewer(revisor);
        } else {
            return null;
        }
    }

    @DeleteMapping("/{id}")
    public void deletarRevisor(@PathVariable Long id) {
        revisorService.deleteReviewer(id);
    }
}