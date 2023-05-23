package ec.edu.insteclrg.dto;

import java.sql.Date;
import ec.edu.insteclrg.domain.Barrio;
import ec.edu.insteclrg.enums.TipoComunicado;
import lombok.Data;

@Data
public class ComunicadoDTO {
	
	private Long id;
	private String titulo;
	private String Descripcion;
	private Date fechaEmision;
	private TipoComunicado tipocomunicado;
    private Barrio barrio;
}