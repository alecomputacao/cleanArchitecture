package br.com.alura.escola;

import java.time.LocalDateTime;

public class Indicacao {

	private Aluno indicado;
	private Aluno indicante;
	private LocalDateTime dataIndicacao;
	
	
	public Indicacao(Aluno indicado, Aluno indicante) {
		this.indicado = indicado;
		this.indicante = indicante;
		this.dataIndicacao = LocalDateTime.now();
	}

	//Gerar somente os métodos Getters pois como estamos usando o construtor para passagem de parametros

	public Aluno getIndicado() {
		return indicado;
	}


	public Aluno getIndicante() {
		return indicante;
	}


	public LocalDateTime getDataIndicacao() {
		return dataIndicacao;
	}	
	
}