package com.wendelminas.desafio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wendelminas.desafio.entities.Cursos;

public interface CursoRepository extends JpaRepository<Cursos, Long> {

}
