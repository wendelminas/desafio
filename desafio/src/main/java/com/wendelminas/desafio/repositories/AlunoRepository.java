package com.wendelminas.desafio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wendelminas.desafio.entities.Alunos;

public interface AlunoRepository extends JpaRepository<Alunos, Long> {	

}
