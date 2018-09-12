
package cadastrodecursos;

public class Curso {
    private int cursoCodigo;
    private String Descricao;
    private float valor;
    private int numParcelas;
    
     public void cursoCodigo(int cursoCodigo) {
        this.cursoCodigo = cursoCodigo;
    }
     
    public void Descricao(String Descricao) {
        this.Descricao = Descricao;
    }
    
    public void valor(float valor) {
        this.valor = valor;
    }
    
    public void numParcelas(int numParcelas) {
        this.numParcelas = numParcelas;
    }
    
        
    public int cursoCodigo(){
        return cursoCodigo;
    }
    
    public String Descricao(){
        return Descricao;
    }
    
    public float valor(){
        return valor;
    }
    
    public int numParcelas(){
        return numParcelas;
    }

    
}
