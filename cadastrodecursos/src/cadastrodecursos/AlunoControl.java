/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastrodecursos;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AlunoControl {
    PreparedStatement ps;
    ResultSet rs;
   
    
    private String cadastrar = "INSERT INTO Aluno (mat,CursoCodigo,nome,cidade,estado) Values (?,?,?,?,?)";
    
    public void cadastrar (Conexao conn , Aluno al){
       try { 
           
           ps = (PreparedStatement)conn.conectar().prepareStatement(cadastrar);
           ps.setInt(1, al.mat());
           ps.setInt(2, al.cursoCodigo());
           ps.setString(3, al.nome());
           ps.setString(4, al.cidade());
           ps.setString(5 ,al.estado());
           
           ps.executeUpdate();
           
           System.out.println("Dados inseridos com sucesso");
           
           
       }catch (SQLException sql){
           System.out.println("Erro ao inserir dados " + sql);
       }
    } 
    public void alterar (Conexao conn , Aluno al){
       String alterar = "UPDATE Aluno set CursoCodigo = ? ,nome = ? , cidade = ? , estado = ?  where mat = ?";
      try{  ps = (PreparedStatement)conn.conectar().prepareStatement(alterar);
           ps.setInt(1, al.cursoCodigo());
           ps.setString(2, al.nome());
           ps.setString(3, al.cidade());
           ps.setString(4 ,al.estado());
           ps.setInt(5, al.mat());
           
           ps.executeUpdate();
           
           System.out.println("Dados alterados");

      }catch (SQLException sql){
          System.out.println("Erro ao alterar dados " + sql);
      
      }
    }
    public void consultar (Conexao conn , Aluno al){
      
      String consultar = "SELECT * from Aluno where mat = ?;";

        try {
            ps = (PreparedStatement) conn.conectar().prepareStatement(consultar);
            ps.setInt(1, al.mat());
            rs = ps.executeQuery();
            
            while (rs.next()){
            
                System.out.println("Matrícula do aluno : " + rs.getInt("mat")+ "\n" +"Código do curso : "+ rs.getString(
                        "CursoCodigo")+"\n" + "Nome : " + rs.getString("nome") + "\n" + "cidade : " + rs.getString("cidade")
                        + "\n" + "Estado :" + rs.getString("estado"));
            
            }
            
        } catch (SQLException sql) {
            System.out.println("Erro ao consultar dados " + sql);
        }
      
      }
}
