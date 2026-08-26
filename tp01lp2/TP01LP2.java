/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp01lp2;

/**
 *
 * @author aluno
 */
public class TP01LP2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Author a = new Author("fabio", "fabio@gmail.com" , 'm');
        System.out.println(a.toString());
        
        System.out.println("-------------------------");
        System.out.println("Testando o setter");
        a.setEmail();
        
        System.out.println("-------------------------");
        System.out.println("Testando os getters!");
        System.out.println("Nome: " + a.getName());
        System.out.println("Email: " + a.getEmail());
        System.out.println("Gender: " + a.getGender());
        
    }
    
}
