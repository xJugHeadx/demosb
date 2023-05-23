package ec.edu.insteclrg.dto;

import ec.edu.insteclrg.domain.Barrio;
import jakarta.persistence.Column;
import lombok.Data;

@Data
public class CasaDTO {
	
	private Long id;
	private String numero;
	private String callePrincipal;
	private String calleSecundaria;
	private String referencia;
	private String numeropersonas;
	private Barrio barrios;
}
