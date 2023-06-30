package com.wendelminas.desafio.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.wendelminas.desafio.entities.Usuarios;
import com.wendelminas.desafio.services.UsuarioService;

import jakarta.validation.Valid;

@RestController
@CrossOrigin("*")
@RequestMapping("/usuarios")
public class UsuarioController {
	
	private UsuarioService usuariosService;
	
	public UsuarioController(UsuarioService usuarioService) {
		this.usuariosService = usuarioService;
	}
	
	@GetMapping
	public ResponseEntity<List<Usuarios>> listaUsuarios(){
		return ResponseEntity.status(200).body(usuariosService.listarUsuarios());
	}
	
	@PostMapping
	public ResponseEntity<Usuarios> addUsuario(@Valid @RequestBody Usuarios usuario) {
		return ResponseEntity.status(201).body(usuariosService.addUsuario(usuario));
	}
	
	@PutMapping
	public ResponseEntity<Usuarios> editUsuario(@Valid @RequestBody Usuarios usuario) {
		return ResponseEntity.status(200).body(usuariosService.editUsuario(usuario));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> delUsuario(@PathVariable Integer id) {
		usuariosService.delUsuario(id);
		return ResponseEntity.status(204).build();
	}
	@PostMapping("/login")
	public ResponseEntity<Usuarios> validSenha(@Valid @RequestBody Usuarios usuario) {
		Boolean valid = usuariosService.validarSenha(usuario);
		if (!valid) {
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
		}
		return ResponseEntity.status(200).build();
	}
	
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public Map<String, String> handleValidationException(MethodArgumentNotValidException ex) {
		Map<String, String> errors = new HashMap<>();
		
		ex.getBindingResult().getAllErrors().forEach((error) -> {
			String fieldName = ((FieldError) error).getField();
			String errorMessage = error.getDefaultMessage();
			errors.put(fieldName, errorMessage);
		});
		return errors;
	}

}
