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
public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty = 0;
    
    //Construtores
    public Book(String name, Author[] authors, double price){
        this.name = name;
        this.authors = authors;
        this.price = price;
    }
    
    public Book(String name, Author[] authors, double price, int qty){
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }
    
    //Setters
    public void setPrice(double price){
        this.price = price;
    }
    public void setQty(int qty) {
        this.qty = qty;
    }
    //Getters
    public String getName() {
        return this.name;
    }
    public Author[] getAuthors() {
        return this.authors;
    }
    public double getPrice() {
        return this.price;
    }
    public int getQty() {
        return this.qty;
    }
    
    //Métodos Auxiliares
}
