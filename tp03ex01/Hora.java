/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp03ex01.tp03ex01;
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
            System.out.print("Insira o valor dos minutos: ");
            m = sc.nextInt();
            if (m >= 0 && m <= 60) {
                break;
            }
        }
        
        //Validação dos segundos
        while(true) {
            System.out.print("Insira o valor dos segundos: ");
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
        this.hora = h;
    }
    public void setMin(int m) {
        this.min = m;
    }
    public void setSeg(int s) {
        this.seg = s;
    }
    //2.2- Setters --- sem argumentos
    public void setHora() {
        Scanner sc = new Scanner(System.in);
        int h;
        while(true) {
            System.out.print("Insira o valor da hora: ");
            h = sc.nextInt();
            if (h >= 0 && h <= 23) {
                break;
            }
        }
        this.hora = h;
    }
    public void setMin(){
        Scanner sc = new Scanner(System.in);
        int m;
            while(true) {
                System.out.print("Insira o valor dos minutos: ");
                m = sc.nextInt();
                if (m >= 0 && m <= 60) {
                    break;
            }
        }
            this.min = m;
    }
    public void setSeg() {
        Scanner sc = new Scanner(System.in);
        int s;
            while(true) {
            System.out.print("Insira o valor dos segundos: ");
            s = sc.nextInt();
            if (s >= 0 && s <= 59) {
                break;
            }
        }
        this.seg = s;
    }
    
    //3- Getters
    public int getHora() {
        return this.hora;
    }
    public int getMin() {
        return this.min;
    }
    public int getSeg() {
        return this.seg;
    }
    public String getHora1() {
                String strHora ="";
        String strMin ="";
        String strSeg ="";
        if (this.hora < 10) {
            strHora = "0" + this.hora;
        }
        else {
            strHora = "" + this.hora;
        }
        if (this.min < 10) {
            strMin = "0" + this.min;
        }
        else {
            strHora = "" + this.min;
        }
        if (this.seg < 10) {
            strSeg = "0" + this.seg;
        }
        else {
            strHora = "" + this.seg;
        }
        return strHora + ":" + strMin + ":" + strSeg;
    } 
    public String getHora2(){
        int horaConv = 0;
        String periodo;
        if (this.hora >= 12) {
            periodo = "PM";
        }
        else {
            periodo = "AM";
        }
        
        if (this.hora == 0) {
            horaConv = 12;
            periodo = "AM";
        }
        else if (this.hora > 12){
            horaConv = this.hora - 12;
        }
        else {
            horaConv = this.hora;
        }
        return String.format("%02d:%02d:%02d (%s)", horaConv, this.min, this.seg, periodo);
    }
    
    public int getSegundos() {
        int MinEmS = this.min * 60;
        int HoraEmS = this.hora * 3600;
        return this.seg + MinEmS + HoraEmS;
    }
}
