package ec.edu.insteclrg.dto;

import ec.edu.insteclrg.domain.Pais;
import lombok.Data;

@Data
public class ProvinciaDTO {
	
	private Long id;
	private String nombre;
    private PaisDTO pais;
}