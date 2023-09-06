package br.com.alura.vo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TelefoneTest {

	TelefoneTest tt;
	
	@BeforeEach
    public void beforeEachTest()
    {
		tt = new TelefoneTest();
    }
	
	@Test
	void naoDeveriaCriarTelefoneComDDDsInvalidos() {
		assertThrows(IllegalArgumentException.class, 
				() ->  new Telefone(null,"12345656"));
		
		assertThrows(IllegalArgumentException.class, 
				() ->  new Telefone("","12345656"));
	
		assertThrows(IllegalArgumentException.class, 
				() ->  new Telefone("1","12345656"));
	}
	
	@Test
	void naoDeveriaCriarTelefoneComNumerosInvalidos() {
		assertThrows(IllegalArgumentException.class, 
				() ->  new Telefone("034","12345678"));
		
		assertThrows(IllegalArgumentException.class, 
				() ->  new Telefone("34","1234"));
	
		assertThrows(IllegalArgumentException.class, 
				() ->  new Telefone("34",null));
	}
	
	@Test
	void deveriaCriarTelefoneComNumerosEDDDValidos() {
		
		String ddd = "34";
		String numero = "99998888";
		Telefone telefone = new Telefone(ddd, numero);
		assertEquals(ddd, telefone.getDdd());
		assertEquals(numero, telefone.getNumero());
	}
	
}	
