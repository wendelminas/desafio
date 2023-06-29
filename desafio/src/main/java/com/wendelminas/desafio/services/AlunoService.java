package com.wendelminas.desafio.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.wendelminas.desafio.entities.Alunos;
import com.wendelminas.desafio.repositories.AlunoRepository;

public class AlunoService {
	
	@Autowired
	private AlunoRepository repository;	
	
	public List<Alunos> result = repository.findAll();
	
}
