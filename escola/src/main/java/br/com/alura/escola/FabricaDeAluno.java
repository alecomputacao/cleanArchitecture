package br.com.alura.escola;

import br.com.alura.vo.CPF;
import br.com.alura.vo.Email;


//Classe usada para implementar o pattern Builder. Melhorar a instanciação do Objeto Aluno
public class FabricaDeAluno {

	private Aluno aluno;

	//Retornando a propria fábrica, podemos usar o encadeamento dos métodos conforme exemplo no main abaixo

	public FabricaDeAluno comNomeCPFEmail(String nome,String cpf, String email) throws IllegalArgumentException {

		this.aluno = new Aluno(nome,new CPF(cpf),new Email(email));
		return this;
	}

	public FabricaDeAluno comTelefone(String ddd,String numero) {

		this.aluno.adicionarTelefone(ddd, numero);
		return this;
	}
	
	//Devolve o Objeto Aluno criado
	public Aluno criar() {
		return this.aluno;
	}

	/*Exemplo de encadeamento dos métodos
	 * public static void main(String[] args) { FabricaDeAluno fabrica = new
	 * FabricaDeAluno(); Aluno aluno2 = fabrica.comNomeCPFEmail("", "", "") .comTelefone("", "")
	 * .comTelefone("", "")
	 * .criar();
	 * 
	 * }
	 */
}