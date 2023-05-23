package ec.edu.insteclrg.domain;


import ec.edu.insteclrg.enums.Sexo;
import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class Presidente {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, nullable = false)
    private Long id;
	
    @Column(nullable = false, length = 50)
    private String nombre;

    @Column(nullable = false, length = 150)
    private Sexo sexo;
    
    @Column(nullable = false)
    private String nacionalidad;
    
    @Column(updatable = false, length = 50)
	private byte [] foto;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(nullable = false)
    private Comunicado comunicado;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(nullable = false)
    private Barrio barrio;
}
