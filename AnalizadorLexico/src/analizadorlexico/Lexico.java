/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analizadorlexico;

/**
 *
 * @author Joimar
 */
public class Lexico {
    
    
    private String palavras;
    
    public void pegaPalavras(String palavras)
    {
    
    
        this.palavras = palavras;
    
    }
    
    public boolean isIdentificador(Token token)
    {
        boolean identificador = true;
        
        return identificador;
        
        
    }
    
    
    
}
