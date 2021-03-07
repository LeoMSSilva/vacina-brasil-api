package br.com.vacinabrasil.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import br.com.vacinabrasil.repository.*;
import br.com.vacinabrasil.model.*;

@RestController
@RequestMapping("/usuarios")
@ResponseStatus(HttpStatus.CREATED)
public class UsuarioController {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@GetMapping
	public List<Usuario> ler(){
		try{
			return usuarioRepository.findAll();
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Requisição inválida!", e);
		}
	}
	
	@PostMapping
	public Usuario criar(@RequestBody  Usuario usuario){
		try{
			return usuarioRepository.save(usuario);
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Requisição inválida!", e);
		}
	}
	
	@PutMapping
	public Usuario alterar(@RequestBody Usuario usuario){
		try{
			return usuarioRepository.save(usuario);
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Requisição inválida!", e);
		}
	}
	
	@DeleteMapping
	public void deletar(@RequestBody Usuario usuario){
		try{
			usuarioRepository.deleteById(usuario.getId());
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Requisição inválida!", e);
		}
	}
}
