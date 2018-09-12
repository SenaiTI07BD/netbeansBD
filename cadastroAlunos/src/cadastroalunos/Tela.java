/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastroalunos;

/**
 *
 * @author senai
 */
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;


public class Tela {    
    
    public static void main(String[] args) {
        
        Conexao conn = new Conexao();
        
        PreparedStatement pstm;
    
        String cadastraaluno = "INSERT INTO ALUNOS("
            + "MAT, NOME, CIDADE, UF)"
            + "VALUES "
            + "(?,?,?,?)";        
        
        try{
            
            pstm = (PreparedStatement) conn.conectar().prepareStatement(cadastraaluno);
            pstm.setInt(1, 1);
            pstm.setString(2, "Macedo");
            pstm.setString(3, "Londrina");
            pstm.setString(4, "PR");            
            pstm.executeUpdate();
            System.out.println("Aluno Matriculado com sucesso");
            
        }catch (Exception e){
            e.printStackTrace();
            
            System.out.println("Erro ao efetivar a matrícula!" + e);            
        }
        
    }
}