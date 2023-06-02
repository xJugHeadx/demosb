package ec.edu.insteclrg.service.crud;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.insteclrg.domain.Barrio;
import ec.edu.insteclrg.dto.BarrioDTO;
import ec.edu.insteclrg.persistence.BarrioRepository;
import ec.edu.insteclrg.service.GenericCrudServiceImpl;

@Service
public class BarrioService extends GenericCrudServiceImpl<Barrio, BarrioDTO>{

	@Autowired
	private BarrioRepository repository;
	
	private ModelMapper modelMapper  = new ModelMapper();
	
	@Override
	public Optional<Barrio> find(BarrioDTO dto) {
		return repository.findById(dto.getId());
	}

	@Override
	public BarrioDTO mapToDto(Barrio domain) {
		return modelMapper.map(domain, BarrioDTO.class);
	}

	@Override
	public Barrio mapToDomain(BarrioDTO dto) {
		return modelMapper.map(dto, Barrio.class);
	}

}
