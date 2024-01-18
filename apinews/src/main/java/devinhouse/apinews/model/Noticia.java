package devinhouse.apinews.model;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class Noticia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String textoNoticia;

    @ManyToOne
    private Revisor revisor;

    @ManyToOne
    private Jornalista jornalista;

    private Date dataCriacao;
    private Date dataAtualizacao;

}
