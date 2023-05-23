package ec.edu.insteclrg.domain;


import java.sql.Date;

import ec.edu.insteclrg.enums.Sexo;
import ec.edu.insteclrg.enums.TipoIdentificacion;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Habitante {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(updatable = false, nullable = false)
	private Long id;
	
	@Column(nullable = false)
	private String identificacion;
	
	@Column(nullable = false)
	private TipoIdentificacion tipoIdentificacion;
	
	@Column(nullable = false, length = 50)
	private String nombre;
	
	@Column(nullable = false, length = 50)
	private String apellido;
	
	@Column(nullable = false)
	private Date fechaNacimiento;
	
	@Column(updatable = false, length = 50)
	private String email;
	
	@Column(nullable = false, length = 10)
	private String telefono;
	
	@Column(nullable = false)
	private Sexo sexo;
	
	@Column(nullable = false, length = 10)
	private String imagen;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = false)
	private Casa casa;
	
}