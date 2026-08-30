/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp04.tp01lp2;

/**
 *
 * @author PICHAU
 */
public class Staff extends Person {
    String school;
    double pay;
    
    //Método construtor
    public Staff(String name, String address, String school, double pay){
        super(name, address);
        this.name = name;
        this.address = address;
        this.school = school;
        this.pay = pay;
    }
    
    //Setters
    public void setSchool(String school){
        this.school = school;
    }
    public void setPay (double pay) {
        this.pay = pay;
    }
    
    //Getters
    public String getSchool(){
        return this.school;
    }
    public double getPay(){
        return this.pay;
    }
    
    //métodos auxiliares
    public String toString(){
        return ("Staff[Person[name=" + this.name + ", address=" + this.address + 
                "], school=" + this.school + ", pay=" + this.pay + "]");
    }
}
