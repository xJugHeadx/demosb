package ec.edu.insteclrg.dto;

import java.sql.Date;

import ec.edu.insteclrg.domain.Casa;
import ec.edu.insteclrg.enums.Sexo;
import ec.edu.insteclrg.enums.TipoIdentificacion;

import lombok.Data;

@Data
public class HabitanteDTO {
	
	private Long id;
	private String nombre;
	private String apellido;
	private String identificacion;
	private Date fechaNacimiento;
	private String direccion;
	private String telefono;
	private String email;
	private TipoIdentificacion tipoIdentificacion;
	private Sexo sexo;
	private byte[] foto;
	private Casa casa;
	
}

