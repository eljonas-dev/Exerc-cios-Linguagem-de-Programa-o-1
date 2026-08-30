/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp04.tp01lp2;

/**
 *
 * João Victor dos Santos, Luis Tiago Ferreira
 */
public class Student extends Person {
    String program;
    int year;
    double fee;
    
    //Método construtor
    public Student(String name, String address, String program, int year, double fee) {
        super(name, address);
        this.name = name;
        this.address = address;
        this.program = program;
        this.year = year;
        this.fee = fee;
    }
    
    //Setters
    public void setProgram(String program){
        this.program = program;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setFee(double fee) {
        this.fee = fee;
    }
    
    //Getters
    public String getProgram(){
        return this.program;
    }
    public int getYear(){
        return this.year;
    }
    public double getFee() {
        return this.fee;
    }
    
    //Métodos auxiliares
    public String toString() {
        return ("Student[Person[name=" + this.name + ", address=" + this.address + 
                "], program=" + this.program + ", year=" + this.year + ", fee=" + this.fee + "]");
    }
}
