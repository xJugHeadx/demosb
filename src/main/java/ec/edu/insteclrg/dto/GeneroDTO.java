package ec.edu.insteclrg.dto;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class GeneroDTO {
	
	private Long id;
	private String nombre;
	private String pronombre;
	private String simbolo;
}