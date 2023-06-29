package com.wendelminas.desafio.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wendelminas.desafio.entities.Usuarios;
import com.wendelminas.desafio.repositories.UsuarioRepository;

@RestController
@CrossOrigin("*")
@RequestMapping("/usuarios")
public class UsuarioController {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@GetMapping
	public List<Usuarios> listaUsuarios (){
		return (List<Usuarios>) usuarioRepository.findAll();
	}
	
	@PostMapping
	public Usuarios addUsuario(@RequestBody Usuarios usuario) {
		Usuarios newUsuario = usuarioRepository.save(usuario);
		return newUsuario;
	}
	
	@PutMapping
	public Usuarios editUsuario(@RequestBody Usuarios usuario) {
		Usuarios newUsuario = usuarioRepository.save(usuario);
		return newUsuario;
	}
	
	@DeleteMapping("/{id}")
	public Optional<Usuarios> delUsuario(@PathVariable Integer id) {
		Optional<Usuarios> usuario = usuarioRepository.findById(id);
		usuarioRepository.deleteById(id);
		return usuario;
	}

}
