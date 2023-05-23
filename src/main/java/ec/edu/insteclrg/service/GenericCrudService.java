package ec.edu.insteclrg.service;

import java.util.List;
import java.util.Optional;

public interface GenericCrudService<DOMAIN, DTO> {

	public void save(DTO dto);

	public void update(DTO dto);

	public void delete(DTO dto);

	public abstract Optional<DOMAIN> find(DTO dto);

	public List<DTO> findAll(DTO dto);

	DOMAIN mapToDomain(DTO dto);

	DTO mapToDto(DOMAIN domain);

}