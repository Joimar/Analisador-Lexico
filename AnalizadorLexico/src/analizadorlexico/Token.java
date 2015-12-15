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
public class Token {
    
    private int teste; int teste2;
    private String tipo;
    private int linha;
    
    
    
    
    
    
    
    public void setTipo(String tipo)
    {
    
        this.tipo = tipo;
    
    
    
    }
    
    public String getTipo()
    {
    
        return tipo;
    
    }
    
    
    public void setLinha(int linha)
    {
    
        this.linha = linha;
    
    }
    
    public int getLinha()
    {
    
        return linha;
    
    }
    
    
}
