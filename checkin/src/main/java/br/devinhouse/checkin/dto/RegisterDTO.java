package br.devinhouse.checkin.dto;

import br.devinhouse.checkin.model.TipoRegistro;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;

import java.time.LocalTime;
import java.util.List;

@Data
public class RegisterDTO {

    private Long id;
    private LocalTime horaRegistro;
    private TipoRegistro tipoRegistro;


}
