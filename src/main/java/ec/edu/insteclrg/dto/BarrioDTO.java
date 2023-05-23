package ec.edu.insteclrg.dto;

import ec.edu.insteclrg.domain.TipoBarrio;
import jakarta.persistence.Column;
import lombok.Data;

@Data
public class BarrioDTO {
	
    private Long id;
    private String nombre;
    private Integer calificacionPositiva;
    private Integer calificacionNegativa;
    private String administrador;
    private TipoBarrio tipoBarrio;
    
}
