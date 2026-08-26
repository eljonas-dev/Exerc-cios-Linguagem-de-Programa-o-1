/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp01lp2;
import java.util.*;
/**
 *
 * @author aluno
 */
public class Author {
    private String name;
    private String email;
    private char gender;
    
    //Construtor
    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    //setter
    public void setEmail(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira seu endereço de e-mail: ");
        this.email = sc.next();
    }
    
    //getters
    public String getName() {
        return this.name;
    }
    public String getEmail() {
        return this.email;
    }
    public char getGender() {
        return this.gender;
    }
    
    //métodos auxiliares
    public String toString() {
        return ("Author[name=" + this.name + ", email=" + this.email + ", gender=" + this.gender + "]");
    }
}
