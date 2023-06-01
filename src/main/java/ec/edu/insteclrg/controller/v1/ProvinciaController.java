package ec.edu.insteclrg.controller.v1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ec.edu.insteclrg.dto.ProvinciaDTO;
import ec.edu.insteclrg.service.crud.ProvinciaService;
import jakarta.annotation.PostConstruct;

@RestController
@RequestMapping("/api/v1.0/provincia/")
public class ProvinciaController {
	
	@Autowired
	ProvinciaService service;
	
	@PostMapping
	public ResponseEntity<Object> guardar(@RequestBody ProvinciaDTO dto) {
		service.save(dto);
		return new ResponseEntity<>("Guardado correctamente", HttpStatus.OK);
	}
}
