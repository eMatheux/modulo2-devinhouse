package br.devinhouse.checkin.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalTime;

@Entity
@Data
public class Register {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "employee_id", nullable = false, referencedColumnName = "id")
    private Employe employee;

    private LocalTime horaRegistro;

    @Enumerated(EnumType.STRING)
    private TipoRegistro tipoRegistro;
}
