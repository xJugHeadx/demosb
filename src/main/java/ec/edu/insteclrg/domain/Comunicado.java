package ec.edu.insteclrg.domain;

import java.sql.Date;

import ec.edu.insteclrg.enums.TipoComunicado;
import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class Comunicado {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, nullable = false)
    private Long id;
	
    @Column(nullable = false, length = 50)
    private String titulo;

    @Column(nullable = false, length = 150)
    private String descripcion;
    
    @Column(nullable = false)
    private Date fechaEmision;
    
    @Column(updatable = false, length = 50)
	private String autor;
    
    @Column(nullable = false)
    private TipoComunicado tipoComunicado;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(nullable = false)
    private Barrio barrio;
}
