package ec.edu.insteclrg.service.crud;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.insteclrg.domain.Ciudad;
import ec.edu.insteclrg.dto.CiudadDTO;
import ec.edu.insteclrg.persistence.CiudadRepository;
import ec.edu.insteclrg.service.GenericCrudServiceImpl;

@Service
public class CiudadService extends GenericCrudServiceImpl<Ciudad, CiudadDTO>{

	@Autowired
	private CiudadRepository repository;
	
	private ModelMapper modelMapper = new ModelMapper();
	
	@Override
	public Optional<Ciudad> find(CiudadDTO dto) {
		return repository.findById(dto.getId());
	}

	@Override
	public CiudadDTO mapToDto(Ciudad domain) {
		return modelMapper.map(domain, CiudadDTO.class);
	}

	@Override
	public Ciudad mapToDomain(CiudadDTO dto) {
		return modelMapper.map(dto, Ciudad.class);
	}

}

