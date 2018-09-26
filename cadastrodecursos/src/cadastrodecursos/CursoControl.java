package cadastrodecursos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CursoControl {
    PreparedStatement ps;
    ResultSet rs;
    float valorX;
    int numParcelasX;
    int aux;

    public float getValorX() {
        return valorX;
    }

    public int getNumParcelasX() {
        return numParcelasX;
    }

    public int getAux() {
        return aux;
    }
            
    
    private String cadastrar = "INSERT INTO Curso (CursoCodigo,Descricao,valor,numParcelas) Values (?,?,?,?)";
    
    public void cadastrar (Conexao conn , Curso cr){
       try { 
           
           ps = (PreparedStatement)conn.conectar().prepareStatement(cadastrar);
           ps.setInt(1, cr.cursoCodigo());
           ps.setString(2, cr.Descricao());
           ps.setFloat(3, cr.valor());
           ps.setInt(4, cr.numParcelas());
                      
           ps.executeUpdate();
           
           System.out.println("Dados inseridos com sucesso");
           
           
       }catch (SQLException sql){
           System.out.println("Erro ao inserir dados " + sql);
       }
    } 
    public void alterar (Conexao conn , Curso cr){
       String alterar = "UPDATE Curso set Descricao = ? ,valor = ? , numParcelas = ?  where CursoCodigo = ?";
      try{  ps = (PreparedStatement)conn.conectar().prepareStatement(alterar);
           ps.setString(1, cr.Descricao());
           ps.setFloat(2, cr.valor());
           ps.setInt(3, cr.numParcelas());
           ps.setInt(4 ,cr.cursoCodigo());
           
           
           ps.executeUpdate();
           
           System.out.println("Dados alterados");

      }catch (SQLException sql){
          System.out.println("Erro ao alterar dados " + sql);
      
      }
    }
    
    public void consultar (Conexao conn , Curso cr){
      
      String consultar = "SELECT * from Curso where CursoCodigo = ?;";

        try {
            ps = (PreparedStatement) conn.conectar().prepareStatement(consultar);
            ps.setInt(1, cr.cursoCodigo());
            rs = ps.executeQuery();
            
            while (rs.next()){
            
                System.out.println("Código do Curso : " + rs.getInt("cursoCodigo")+ "\n" +"Descrição : "+ rs.getString(
                        "Descricao")+"\n" + "Valor : " + rs.getFloat("valor") + "\n" + "numParcelas : " + rs.getInt("numParcelas")
                        + "\n");
            
            }           
        } catch (SQLException sql) {
            System.out.println("Erro ao consultar dados " + sql);
        }     
      }
    public void calculoMensalidade(Conexao conn, Curso cr) throws SQLException{
        
        String consult = "SELECT * from Curso where CursoCodigo = ?;";   
        
        try{
            ps = (PreparedStatement) conn.conectar().prepareStatement(consult);
            ps.setInt(1, cr.cursoCodigo());
            rs = ps.executeQuery(); 
            
            while (rs.next()){
                
                System.out.println("Valor" + rs.getFloat("valor")+
                        "\n" + "NumParcelas" + rs.getInt("numParcelas"));
                this.valorX = rs.getFloat("valor");
                this.numParcelasX = rs.getInt("numParcelas");
                this.aux = (int) (valorX / numParcelasX);
                System.out.println("Valor das Parcelas" + aux);
                
                
                
            }
        } catch (SQLException sql) {
            System.out.println("Erro ao consultar dados " + sql);
        }
    }
}
