package ec.edu.insteclrg.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import ec.edu.insteclrg.domain.Ciudad;

public interface CiudadRepository extends JpaRepository<Ciudad, Long> {
				
}
