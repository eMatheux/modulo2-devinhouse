package br.devinhouse.checkin.repositories;

import br.devinhouse.checkin.model.Register;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Collection;
import java.util.List;

public interface RegisterRepository extends JpaRepository<Register, Long> {
    @Query("SELECT r FROM Register r WHERE r.employee.id = :employeeId")
    List<Register> findByEmployeeId(@Param("employeeId") Long employeeId);
}
