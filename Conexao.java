/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Curso;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author senai
 */
public class Conexao {

    Connection conn;
       
    public static void main(String[] args) {
        new Conexao();
    }
    public Conexao(){
           
           conectar();
       }
    public Connection conectar() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/senai?user=root&password=venus");
            System.out.println("Conexao realizada com sucesso");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Nao foi possivel encontrar o driver");

        } catch (SQLException sql) {
            System.out.println("erro no banco" + sql);
        }

        return conn;
    }
}
