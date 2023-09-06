package br.com.alura.vo;

public class CPF {
    
    private String numero;

    public CPF(String numero) throws IllegalArgumentException {
        if(numero.equals(null) || 
           !numero.matches("[0-9]{2}[\\.]?[0-9]{3}[\\.]?[0-9]{3}[\\/]?[0-9]{4}[-]?[0-9]{2})|([0-9]{3}[\\.]?[0-9]{3}[\\.]?[0-9]{3}[-]?[0-9]{2}")) 
        {

            throw new IllegalArgumentException("cpf digitado não é válido!");
        }
        this.numero = numero;
    }
}
