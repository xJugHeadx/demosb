package ec.edu.insteclrg.domain;

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
public class Barrio {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, nullable = false)
    private Long id;

    @Column(nullable = false)
    private String nombre;
    
    @Column(nullable = false)
    private String administrador;
    
    @Column()
    private Integer calificacionPositiva;
    
    @Column()
    private Integer calificacionNegativa;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tipoBarrio_id", nullable = false)
    private TipoBarrio tipoBarrio;
}