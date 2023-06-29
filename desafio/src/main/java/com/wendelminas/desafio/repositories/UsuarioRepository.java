package com.wendelminas.desafio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wendelminas.desafio.entities.Usuarios;

public interface UsuarioRepository extends JpaRepository<Usuarios, Integer> {

}
