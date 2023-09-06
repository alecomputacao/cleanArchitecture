package br.com.alura.escola;

import br.com.alura.vo.Email;

import java.util.ArrayList;
import java.util.List;

import br.com.alura.vo.CPF;
import br.com.alura.vo.Telefone;

public class Aluno {
    
    private String nome;
    private CPF cpf;

    private Email email;
    
    private List<Telefone> telefones = new ArrayList();

    //Construtor não tem telefones pois existe uma método para isto
    public Aluno(String nome, CPF cpf, Email email) {
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
	}

	public void adicionarTelefone(String ddd, String numero) {
    	
    	this.telefones.add(new Telefone(ddd, numero));
    	
    }
    
    
}