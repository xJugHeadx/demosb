package ec.edu.insteclrg.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import ec.edu.insteclrg.domain.Pais;

public interface PaisRepository extends JpaRepository<Pais, Long> {

}
