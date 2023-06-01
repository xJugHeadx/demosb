package ec.edu.insteclrg.service.crud;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.insteclrg.service.GenericCrudServiceImpl;
import ec.edu.insteclrg.domain.Pais;
import ec.edu.insteclrg.dto.PaisDTO;
import ec.edu.insteclrg.persistence.PaisRepository;

@Service
public class PaisService extends GenericCrudServiceImpl<Pais, PaisDTO>{

	@Autowired
	private PaisRepository repository;
	
	private ModelMapper modelMapper = new ModelMapper();
	
	@Override
	public Optional<Pais> find(PaisDTO dto) {
		return repository.findById(dto.getId());
	}

	@Override
	public PaisDTO mapToDto(Pais domain) {
		return modelMapper.map(domain, PaisDTO.class);
	}

	@Override
	public Pais mapToDomain(PaisDTO dto) {
		return modelMapper.map(dto, Pais.class);
	}
}
