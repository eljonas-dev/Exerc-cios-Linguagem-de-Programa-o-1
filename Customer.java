/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exaula8;

/**
 *
 * @author aluno
 */
public class Customer {
    private int id;
    private String nome;
    private String endereco;
    private String telefone;
    private String email;
    
    public void setCustInfo(int id, String nome, String endereco, String telefone) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }
    public void setCustInfo(int id, String nome, String endereco, String telefone, String email) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
    }
    public void displayCustomer() {
        System.out.println(id);
        System.out.println(nome);
        System.out.println(endereco);
        System.out.println(telefone);
        System.out.println(email);
    }
}
