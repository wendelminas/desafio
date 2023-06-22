package com.wendelminas.desafio.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "aulas")
public class Aulas {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_aula;
	private short dias_aulas;
	
	@ManyToOne
	@JoinColumn(name = "id_aluno")
	private Alunos id_aluno;
	
	@ManyToOne
	@JoinColumn(name = "id_curso")	
	private Cursos id_curso;	
	
	public Aulas(int id_aula, short dias_aulas, Alunos id_aluno, Cursos id_curso) {
		
		this.id_aula = id_aula;
		this.dias_aulas = dias_aulas;
		this.id_aluno = id_aluno;
		this.id_curso = id_curso;
	}

	public int getId_aula() {
		return id_aula;
	}

	public void setId_aula(int id_aula) {
		this.id_aula = id_aula;
	}

	public short getDias_aulas() {
		return dias_aulas;
	}

	public void setDias_aulas(short dias_aulas) {
		this.dias_aulas = dias_aulas;
	}

	public Alunos getId_aluno() {
		return id_aluno;
	}

	public void setId_aluno(Alunos id_aluno) {
		this.id_aluno = id_aluno;
	}

	public Cursos getId_curso() {
		return id_curso;
	}

	public void setId_curso(Cursos id_curso) {
		this.id_curso = id_curso;
	}	
		
}
