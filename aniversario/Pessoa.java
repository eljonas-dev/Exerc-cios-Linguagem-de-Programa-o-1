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
public class Pessoa {
    String nome;
    int idade;
    public void fazAniversario() {
        idade = idade + 1;
        System.out.println(nome + " fez aniversário!");
        System.out.println("Sua idade agora é de " + idade + " anos!"); 
    }
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
 }
