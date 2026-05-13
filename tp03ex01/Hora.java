/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp03ex01;
import java.util.*;
/**
 *
 * @author aluno
 */
public class Hora {
    private int hora;
    private int min;
    private int seg;
    
    //1- Construtores
    public Hora(){
        Scanner sc = new Scanner(System.in);
        int h, m, s;
        //Validação da hora
        while(true) {
            System.out.print("Insira o valor da hora: ");
            h = sc.nextInt();
            if (h >= 0 && h <= 23) {
                break;
            }
        }
        
        //Validação dos minutos
        while(true) {
            System.out.print("Insira o valor dos minutos");
            m = sc.nextInt();
            if (m >= 0 && m <= 60) {
                break;
            }
        }
        
        //Validação dos segundos
        while(true) {
            System.out.print("Insira o valor dos segundos");
            s = sc.nextInt();
            if (s >= 0 && s <= 59) {
                break;
            }
        }
        this.hora = h;
        this.min = m;
        this.seg = s;
        
        //System.out.println(this.hora + ":" + this.min + ":" + this.seg);
        /*
            O construtor Hora() deve permitir ao usuário digitar os valores de hora, minuto e
            segundos e com eles inicializar os atributos da classe. Os valores digitados deverão ser
            consistidos e só aceitos se válidos, caso contrário, exigir ao usuário redigitar;
        */
    }
    
    public Hora(int h, int m, int s) {
        this.hora = h;
        this.min = m;
        this.seg = s;
    }
    //2.1- Setters --- com argumentos
    public void setHora(int h) {
        
    }
    public void setMin(int m) {
        
    }
    public void setSeg(int s) {
        
    }
    //2.2- Setters --- sem argumentos
    public void setHora() {
        
    }
    public void setMin(){
        
    }
    public void setSeg() {
        
    }
    /*
    //3- Getters
    public int getHora() {
        
    }
    public int getMin() {
        
    }
    public int getSeg() {
        
    }
    public String getHora1() {
        
    } 
    public String getHora2(){
        
    }
    public int getSegundos() {
        
    } 
    */
}
