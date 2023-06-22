package com.wendelminas.desafio.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import com.wendelminas.desafio.entities.Alunos;
import com.wendelminas.desafio.repositories.AlunoRepository;

public class AlunoService {
	
	@Autowired
	private AlunoRepository repository;	
	
	@GetMapping
	public List<Alunos> result = repository.findAll();
	return result;
	
}
