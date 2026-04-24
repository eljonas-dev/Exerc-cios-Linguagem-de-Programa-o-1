/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aniversario;

/**
 *
 * @author aluno
 */
public class Aniversario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Pessoa p1 = new Pessoa("Rayssa", 26);
       System.out.println("Rayssa tem " + p1.idade + " anos");
       p1.fazAniversario();
       
       Pessoa p2 = new Pessoa("Postigo", 21);
       System.out.println("Postigo tem " + p2.idade + " anos");
       p2.fazAniversario();
    }
}
