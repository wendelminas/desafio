package com.wendelminas.desafio.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data

@Entity
@Table(name = "usuarios")
public class Usuarios {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_usuario")
	private Integer id_usuario;
	
	@NotBlank(message = "A inclusão do nome é obrigatória")
	@Size(min = 3, message = "O nome deve ter três ou mais caracteres")
	@Column(name = "nome_usuario", length = 100, nullable = false)
	private String nome_usuario;
	
	@Email(message = "O e-mail inserido não é válido")
	@NotBlank(message = "A inclusão do e-mail é obrigatória")	
	@Column(name = "email_usuario", length = 50, nullable = false)
	private String email_usuario;
	
	@NotBlank(message = "A inclusão do número de celular é obrigatória")
	@Column(name = "cel_usuario", length = 15, nullable = false)
	private String cel_usuario;
	
	@NotBlank(message = "A definição de senha é obrigatória")
	@Column(name = "senha_usuario", columnDefinition = "TEXT", nullable = true)
	private String senha_usuario;
	
}
