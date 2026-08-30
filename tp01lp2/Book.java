/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp04.tp01lp2;
/**
 *
 * João Victor dos Santos, Luis Tiago Ferreira
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
    public String toString() {
        String autoresTexto = "";
        
        for (int i = 0; i < authors.length; i++) {
            autoresTexto += authors[i].toString();
            
            if (i < authors.length -1) {
                autoresTexto += ",";
            }
        }
        return "Book[name=" + name +
                ", authors={" + autoresTexto + "}" +
                ",price=" + price +
                ",qty=" + qty + "]";
    }
    
    public String getAuthorNames(){
        String nomes = "";
        
        for (int i = 0; i < authors.length; i++){
            nomes += authors[i].getName();
            
            if (i < authors.length - 1) {
                nomes += ",";
            }
        }
        return nomes;
    }
}
