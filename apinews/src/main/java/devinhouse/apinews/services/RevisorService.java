package devinhouse.apinews.services;
import devinhouse.apinews.model.Revisor;
import devinhouse.apinews.repository.RevisorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RevisorService {

    @Autowired
    private RevisorRepository revisorRepository;

    public List<Revisor> getAllReviewers() {
        return revisorRepository.findAll();
    }

    public Revisor saveReviewer(Revisor revisor) {
        return revisorRepository.save(revisor);
    }

    public Revisor getReviewer(Long id) {
        return revisorRepository.findById(id).orElse(null);
    }

    public void deleteReviewer(Long id) {
        revisorRepository.deleteById(id);
    }
}
