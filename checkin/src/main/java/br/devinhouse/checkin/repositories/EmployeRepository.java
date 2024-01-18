package br.devinhouse.checkin.repositories;

import br.devinhouse.checkin.model.Employe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeRepository extends JpaRepository<Employe, Long> {
}
