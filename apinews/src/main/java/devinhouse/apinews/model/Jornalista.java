package devinhouse.apinews.model;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Jornalista {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Usuario usuario;

    private String nome;
    private Double salario;
    private String nivelCargo;
    private int numeroPublicacoes;
}
