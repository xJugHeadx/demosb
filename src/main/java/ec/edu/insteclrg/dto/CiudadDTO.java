package ec.edu.insteclrg.dto;

import ec.edu.insteclrg.domain.Provincia;
import jakarta.persistence.Column;
import lombok.Data;

@Data
public class CiudadDTO {
	
    private Long id;
	private String nombre;
    private Provincia provincia;
}