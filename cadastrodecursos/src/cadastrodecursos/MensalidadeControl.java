package cadastrodecursos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MensalidadeControl {
    
    PreparedStatement ps;
    ResultSet rs;
    
    private String cadastrar = "INSERT INTO Mensalidade (numParcelas,valor,dataVencimento,dataPagamento) Values (?,?,?,?)";
    
    public void cadastrar (Conexao conn , Mensalidade ms){
       try { 
           
           ps = (PreparedStatement)conn.conectar().prepareStatement(cadastrar);
           ps.setInt(1, ms.numParcelas());
           ps.setFloat(2, ms.valor());
           ps.setString(3, ms.dataVencimento());
           ps.setString(4, ms.dataPagamento());
                      
           ps.executeUpdate();
           
           System.out.println("Dados inseridos com sucesso");
           
           
       }catch (SQLException sql){
           System.out.println("Erro ao inserir dados " + sql);
       }
    } 
    public void alterar (Conexao conn , Mensalidade ms){
       String alterar = "UPDATE Mensalidade set valor = ? ,dataVencimento = ? , dataPagamento = ?  where numParcelas = ?";
      try{  ps = (PreparedStatement)conn.conectar().prepareStatement(alterar);
           ps.setFloat(1, ms.valor());
           ps.setString(2, ms.dataVencimento());
           ps.setString(3, ms.dataPagamento());
           ps.setInt(4 ,ms.numParcelas());
           
           
           ps.executeUpdate();
           
           System.out.println("Dados alterados");

      }catch (SQLException sql){
          System.out.println("Erro ao alterar dados " + sql);
      
      }
    }
    
    public void consultar (Conexao conn , Mensalidade ms){
      
      String consultar = "SELECT * from Mensalidade where numParcelas = ?;";

        try {
            ps = (PreparedStatement) conn.conectar().prepareStatement(consultar);
            ps.setInt(1, ms.numParcelas());
            rs = ps.executeQuery();
            
            while (rs.next()){
            
                System.out.println("Código do Curso : " + rs.getInt("numParcelas")+ "\n" +"Valor : "+ rs.getInt(
                        "dataVencimento")+"\n" + "Valor : " + rs.getString("valor") + "\n" + "dataPagamento : " + rs.getString("numParcelas")
                        + "\n");
            
            }           
        } catch (SQLException sql) {
            System.out.println("Erro ao consultar dados " + sql);
        }     
      }
    
}
