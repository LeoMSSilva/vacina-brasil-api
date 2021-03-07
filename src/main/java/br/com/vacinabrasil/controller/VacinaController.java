package br.com.vacinabrasil.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import br.com.vacinabrasil.repository.*;
import br.com.vacinabrasil.model.*;

@RestController
@RequestMapping("/vacinas")
@ResponseStatus(HttpStatus.CREATED)
public class VacinaController {

	@Autowired
	private VacinaRepository vacinaRepository;
	
	@GetMapping
	public List<Vacina> ler(){
		try{
			return vacinaRepository.findAll();
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Requisição inválida!", e);
		}
	}
	
	@PostMapping
	public Vacina criar(@RequestBody  Vacina vacina){
		try{
			return vacinaRepository.save(vacina);
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Requisição inválida!", e);
		}
	}
	
	@PutMapping
	public Vacina alterar(@RequestBody Vacina vacina){
		try{
			return vacinaRepository.save(vacina);
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Requisição inválida!", e);
		}
	}
	
	@DeleteMapping
	public void deletar(@RequestBody Vacina vacina){
		try{
			vacinaRepository.deleteById(vacina.getId());
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Requisição inválida!", e);
		}
	}
}
