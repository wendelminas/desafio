package com.wendelminas.desafio.entities;

import jakarta.persistence.Entity;

@Entity
public class Aulas {
	
	private int id_aula;
	private short dias_aulas;
	
	private Alunos id_aluno;
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
