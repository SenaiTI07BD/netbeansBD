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
           ps.setDate(3, ms.dataVencimento());
           ps.setDate(4, ms.dataPagamento());
                      
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
           ps.setDate(2, ms.dataVencimento());
           ps.setDate(3, ms.dataPagamento());
           ps.setInt(4 ,ms.numParcelas());
           
           
           ps.executeUpdate();
           
           System.out.println("Dados alterados");

      }catch (SQLException sql){
          System.out.println("Erro ao alterar dados " + sql);
      
      }
    }
    
    public void consultar (Conexao conn , Mensalidade ms){
      
      String consultar = "SELECT * from Mensalidade where Mat = ?;";

        try {
            ps = (PreparedStatement) conn.conectar().prepareStatement(consultar);
            ps.setInt(1, ms.getIdMat());
            rs = ps.executeQuery();
            
            while (rs.next()){
            
                System.out.println("Código da matricula" + rs.getInt("Mat")+
                        "\n" + "Código do Curso : " + rs.getInt("CurCodigo")+
                        "\n" + "Valor : "+ rs.getFloat("Valor")+
                        "\n" + "NumParcela : " + rs.getString("NumParcela")+
                        "\n" + "dataPagamento : " + rs.getDate("DataPagamento")+
                        "\n" + "dataVencimento : " + rs.getDate("DataVencimento"));
            
            }           
        } catch (SQLException sql) {
            System.out.println("Erro ao consultar dados " + sql);
        }     
      }
    
}
