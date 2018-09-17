/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastrodecursos;

/**
 *
 * @author senai
 */
public class Aluno {
    private int mat;
    private int cursoCodigo;
    private String nome;
    private String cidade;
    private String estado;
    
    
    public void mat(int mat) {
        this.mat = mat;
    }
     
    
    public void nome(String nome) {
        this.nome = nome;
    }
    
    public void cidade(String cidade) {
        this.cidade = cidade;
    }
    
    public void estado(String estado){
        this.estado = estado;
    }
    
    void cursoCodigo(int cursoCodigo) {
        this.cursoCodigo = cursoCodigo;
    }
    
    public int mat() {
        return mat;
    }
    
    public int cursoCodigo(){
        return cursoCodigo;
    }
    
    public String nome(){
        return nome;
    }
    
    public String cidade(){
        return cidade;
    }
    
    public String estado() {
        return estado;
    }

    

    
}
