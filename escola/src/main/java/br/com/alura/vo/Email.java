package br.com.alura.vo;

public class Email {
    
    private String endereco;

    public Email(String endereco) throws IllegalArgumentException {
        if(endereco == null || !endereco.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$")) 
        {

            throw new IllegalArgumentException("Endereço digitado não é válido!");
        }
        this.endereco = endereco;
    }
}
