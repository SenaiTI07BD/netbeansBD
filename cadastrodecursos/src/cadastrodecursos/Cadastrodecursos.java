/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastrodecursos;

import java.util.Scanner;

/**
 *
 * @author senai
 */
public class Cadastrodecursos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
        String opcao;
        String opcao1;

        //PreparedStatement stmt;
        Conexao conn = new Conexao();
        Aluno al = new Aluno();
        AlunoControl ac = new AlunoControl();
        Curso cr = new Curso();
        CursoControl cc = new CursoControl();
        Mensalidade ms = new Mensalidade();
        MensalidadeControl mc = new MensalidadeControl();
        System.out.println("Tela de : \n 1 - Aluno  \n 2 - Curso \n 3 - mensalidade \n");
        System.out.println("digite :");
        opcao1 = entrada.nextLine();
   if (opcao1.equals("1")) {

            System.out.println("---------------------------------- Aluno --------------------------------------");

            System.out.print("Selecione :"
                    + "\n 1 - Cadastrar"
                    + "\n 2 - Alterar \n"
                    + " 3 - Consultar \n");
            System.out.println("Digite : ");
            opcao = entrada.nextLine();

            if (opcao.equals("1")) {
                System.out.println(" Cadastrar :");
                System.out.println("Informe a matrícula do aluno: ");
                al.mat(entrada.nextInt());
                entrada.nextLine();
                System.out.println("informe o código do curso");
                cr.cursoCodigo(entrada.nextInt());
                entrada.nextLine();
                System.out.println("Informe o nome : ");
                al.nome(entrada.nextLine());
                System.out.println("Informe a cidade : ");
                al.cidade(entrada.nextLine());
                System.out.println("Informe o estado : ");
                al.estado(entrada.nextLine());
                entrada.nextLine();
                

                ac.cadastrar(conn, al);

            } else if (opcao.equals("2")) {
                System.out.println(" Alterar :");
                System.out.println("Informe Informe a matrícula do aluno: ");
                al.mat(entrada.nextInt());
                entrada.nextLine();
                System.out.println("Informe o nome : ");
                al.nome(entrada.nextLine());
                System.out.println("Informe a cidade : ");
                al.cidade(entrada.nextLine());
                System.out.println("Informe o estado : ");
                al.estado(entrada.nextLine());
                entrada.nextLine();
                                      
                ac.alterar(conn, al);
                
            } else if (opcao.equals("3")) {
                System.out.println(" Consultar :");
                System.out.println("Informe Informe a matrícula do aluno: ");
                al.mat(entrada.nextInt());
                entrada.nextLine();
                ac.consultar(conn, al);
            }
        }else if (opcao1.equals("2")) {
            System.out.println("---------------------------------- CURSO --------------------------------------");
            System.out.print("Selecione :"
                    + "\n 1 - Inserir"
                    + "\n 2 - Alterar \n"
                    + " 3 - Consultar \n");
            System.out.println("Digite = ");
            opcao = entrada.nextLine();

            if (opcao.equals("1")) {
                System.out.println(" Inserir curso :");
                System.out.println("Informe o curso : ");
                cr.cursoCodigo(entrada.nextInt());
                entrada.nextLine();
                System.out.println("Informe a descriçao : ");
                cr.Descricao(entrada.nextLine());
                System.out.println("Informe o valor : ");
                cr.valor(entrada.nextFloat());
                System.out.println("Informe o numero de parcelas: ");
                cr.numParcelas(entrada.nextInt());
                entrada.nextLine();
                
                cc.cadastrar(conn, cr);
                
            } else if (opcao.equals("2")) {
                System.out.println(" Alterar curso :");
                System.out.println("Informe o curso : ");
                cr.cursoCodigo(entrada.nextInt());
                entrada.nextLine();
                System.out.println("Informe a descriçao : ");
                cr.Descricao(entrada.nextLine());
                System.out.println("Informe o valor : ");
                cr.valor(entrada.nextFloat());
                System.out.println("Informe o numero de parcelas: ");
                cr.numParcelas(entrada.nextInt());
                entrada.nextLine();
                
                cc.alterar(conn, cr);

            } else if (opcao.equals("3")) {
                System.out.println(" Consultar :");
                System.out.println("Digite o id do curso: ");
                cr.cursoCodigo(entrada.nextInt());
                entrada.nextLine();

                cc.consultar(conn, cr);
            }
        }
   
   
    }
}
