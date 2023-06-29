package com.wendelminas.desafio.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuarios")
public class Usuarios {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_usuario")
	private Integer id_usuario;
	
	@Column(name = "nome_usuario", length = 100, nullable = true)
	private String nome_usuario;
	
	@Column(name = "email_usuario", length = 50, nullable = true)
	private String email_usuario;
	
	@Column(name = "cel_usuario", length = 15, nullable = true)
	private String cel_usuario;
	
	@Column(name = "senha_usuario", columnDefinition = "TEXT", nullable = true)
	private String senha_usuario;
	
	public Integer getId_usuario() {
		return id_usuario;
	}
	public void setId_usuario(Integer id_usuario) {
		this.id_usuario = id_usuario;
	}
	public String getNome_usuario() {
		return nome_usuario;
	}
	public void setNome_usuario(String nome_usuario) {
		this.nome_usuario = nome_usuario;
	}
	public String getEmail_usuario() {
		return email_usuario;
	}
	public void setEmail_usuario(String email_usuario) {
		this.email_usuario = email_usuario;
	}
	public String getCel_usuario() {
		return cel_usuario;
	}
	public void setCel_usuario(String cel_usuario) {
		this.cel_usuario = cel_usuario;
	}
	public String getSenha_usuario() {
		return senha_usuario;
	}
	public void setSenha_usuario(String senha_usuario) {
		this.senha_usuario = senha_usuario;
	}
	
}
