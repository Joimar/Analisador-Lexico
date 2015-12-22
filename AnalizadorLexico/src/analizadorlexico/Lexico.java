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
    
     public boolean isIdentificador(String palavras)
    {
       // int i = indice;
       boolean identificador = false;
       String aux ="";
       int iaux=0; 
        for(int i= indice; palavras.charAt(i)!=' '; i++)
        {
            
            if(palavras.charAt(i+1) == ' ') return true;
            else if(palavras.charAt(i+1)>= 48 && palavras.charAt(i+1)<= 57) identificador = true;
            else if(palavras.charAt(i+1)>= 65 && palavras.charAt(i+1)<= 90) identificador = true;
            else if( (palavras.charAt(i+1)>= 97 && palavras.charAt(i+1)<= 122) || (palavras.charAt(i+1) == '_') ) identificador = true;
            else identificador = false;
           // aux.= palavras.charAt(i); //nao lembro como igualar caracterer por caractere 
            iaux++;
        
        }
    
}
