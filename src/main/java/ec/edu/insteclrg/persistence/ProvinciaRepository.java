package ec.edu.insteclrg.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.edu.insteclrg.domain.Provincia;

public interface ProvinciaRepository extends JpaRepository<Provincia, Long> {

}
