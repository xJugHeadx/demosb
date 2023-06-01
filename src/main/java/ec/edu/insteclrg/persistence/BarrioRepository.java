package ec.edu.insteclrg.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import ec.edu.insteclrg.domain.Barrio;

public interface BarrioRepository extends JpaRepository<Barrio, Long> {

}
