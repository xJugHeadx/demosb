package ec.edu.insteclrg.dto;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class PaisDTO {
	
	private Long id;
	private String nombre;
	private String gentilicio;
}
