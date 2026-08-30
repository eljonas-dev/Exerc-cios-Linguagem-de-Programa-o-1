/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp04.tp01lp2;

/**
 *
 * João Victor dos Santos, Luis Tiago Ferreira
 */
public class Person {
   protected  String name;
   protected String address;
    
    //Método construtor
    public Person(String name, String address){
        this.name = name;
        this.address = address;
    }
    
    //Setters
    public void setAddress(String address){
        this.address = address;
    }
    //Getters
    public String getName(){
        return this.name;
    }
    
    public String getAddress(){
        return this.address;
    }
    
    //Métodos auxiliares
    
    public String toString(){
        return ("Person[name=" + this.name + ", address=" + this.address + "]");
    }
}
