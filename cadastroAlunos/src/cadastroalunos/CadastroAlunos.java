/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastroalunos;

import java.util.Date;
 
/*import br.com.agenda.dao.ContatoDAO;
import br.com.agenda.model.Contato;*/

public class CadastroAlunos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ContatoDAO contatoDAO = new ContatoDAO();
 
        //Cria um contato e salva no banco
        Contato contato = new Contato();
        contato.setNome("ETELVINO");
        contato.setIdade(503);
        contato.setDataCadastro(new Date());
 
        contatoDAO.save(contato);
 
        //Atualiza o contato com id = 1 com os dados do objeto contato1
        Contato contato1 = new Contato();
        contato1.setId(1);
        contato1.setNome("NOME NOVO");
        contato1.setIdade(32);
        contato1.setDataCadastro(new Date());
 
        contatoDAO.update(contato1);
 
        //Remove o contato com id = 1
 
        contatoDAO.removeById(1);
 
        //Lista todos os contatos do banco de dados
 
        for(Contato c : contatoDAO.getContatos()){
 
        System.out.println("NOME: " + c.getNome());
        }
    } 

    private static class ContatoDAO {

        public ContatoDAO() {
        }

        private void save(Contato contato) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private void removeById(int i) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private void update(Contato contato1) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private Iterable<Contato> getContatos() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

   
}
