package devinhouse.apinews.repository;

import devinhouse.apinews.model.Jornalista;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JornalistaRepository extends JpaRepository<Jornalista, Long> {
}
