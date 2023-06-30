package com.wendelminas.desafio.services;

import java.util.List;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.wendelminas.desafio.entities.Usuarios;
import com.wendelminas.desafio.repositories.UsuarioRepository;

@Service
public class UsuarioService {
	
	private UsuarioRepository repository;
	public PasswordEncoder passwordEncoder;
	
	public UsuarioService(UsuarioRepository repository) {		
		this.repository = repository;
		this.passwordEncoder = new BCryptPasswordEncoder();
	}
	
	public List<Usuarios> listarUsuarios() {
		List<Usuarios> lista = repository.findAll();
		return lista;
	}
	
	public Usuarios addUsuario(Usuarios usuario) {
		String encoder = this.passwordEncoder.encode(usuario.getSenha_usuario());
		usuario.setSenha_usuario(encoder);
		Usuarios newUsuario = repository.save(usuario);
		return newUsuario;		
	}
	
	public Usuarios editUsuario(Usuarios usuario) {
		String encoder = this.passwordEncoder.encode(usuario.getSenha_usuario());
		usuario.setSenha_usuario(encoder);
		Usuarios newUsuario = repository.save(usuario);
		return newUsuario;		
	}
	
	public Boolean delUsuario(Integer id) {
		repository.deleteById(id);
		return true;
	}

	public Boolean validarSenha(Usuarios usuario) {
		String senha = repository.getById(usuario.getId_usuario()).getSenha_usuario();
		Boolean valid = passwordEncoder.matches(usuario.getSenha_usuario(), senha);
		return valid;
	}

}
