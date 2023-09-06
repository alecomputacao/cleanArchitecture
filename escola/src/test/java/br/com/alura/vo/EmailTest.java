package br.com.alura.vo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmailTest {

	EmailTest et;
	
	@BeforeEach
    public void beforeEachTest()
    {
		et = new EmailTest();
    }
	
	public Boolean TesteEmail(String endereco) throws IllegalArgumentException {
		
		try {
			new Email(endereco);
			return true;
		
		} catch (IllegalArgumentException e) {
			//e.addSuppressed(e);; Suprimir o stacktrace or
			e.printStackTrace();
			return false;
			
		}
	}
	
	@Test
	void naoDeveriaCriarEmailsComEnderecosInvalidos() {
		assertThrows(IllegalArgumentException.class,
				() -> new Email(null));
		
		assertThrows(IllegalArgumentException.class,
				() -> new Email(""));
		
		assertThrows(IllegalArgumentException.class,
				() -> new Email("emailinvalido"));
		
	}
	
	@Test
	void validaEmailCorreto(){
	
		assertTrue(et.TesteEmail("alex@teste.com.br"));
	}

}
