/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp04.lp1p2;
import java.util.*;
/**
 *
 * @author PICHAU
 */
public class ConsultaAgenda {
    Data data;
    Hora hora;
    String nomePaciente;
    static int quantidade = 0;
    String nomeMedico;
    
    //Construtores
    public ConsultaAgenda() {
        Scanner sc = new Scanner(System.in);
        String p, m;
        System.out.println("---------------------------------");
        System.out.println("Agendamento de consulta iniciada!");
        System.out.print("Insira o nome do paciente: ");
        p = sc.next();
        
        System.out.println("Preencha os dados referentes ao agendamento da consulta");
        Data d = new Data();
        Hora h = new Hora(); 
        System.out.print("Insira o nome do médico que fará o atendimento: ");
        m = sc.next();
        
        this.data = d;
        this.hora = h;
        this.nomePaciente = p;
        this.nomeMedico = m;
        this.quantidade += 1;
    }
    public ConsultaAgenda(int h, int mi, int s, int d, int mes, int a, String p, String m) {
        Data data = new Data(d, mes, a);
        Hora hora = new Hora(h, mi, s);
        
        this.data = data;
        this.hora = hora;
        this.nomePaciente = p;
        this.nomeMedico = m;
        this.quantidade += 1;
    }
    public ConsultaAgenda(Data d, Hora h, String p, String m){
        this.data = d;
        this.hora = h;
        this.nomePaciente = p;
        this.nomeMedico = m;
        this.quantidade += 1;
    }
    //Setters com parâmetros
    public void setData(int a, int b, int c) {
        this.data.setDia(a);
        this.data.setMes(b);
        this.data.setAno(c);
    }
    public void setHora(int a, int b, int c) {
        this.hora.setHora(a);
        this.hora.setMin(b);
        this.hora.setSeg(c);
    }
    public void setNomePaciente(String p) {
        this.nomePaciente = p;
    }
    public void setNomeMedico(String m) {
        this.nomeMedico = m;
    }
    
    //Setters sem parâmetros
    public void setData() {
        Data data = new Data();
        this.data = data;
    }
    public void setHora() {
        Hora hora = new Hora();
        this.hora = hora;
    }
    public void setNomePaciente() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira o nome do paciente: ");
        this.nomePaciente = sc.next();
    }
    public void setNomeMedico() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira o nome do médico que fará o atendimento: ");
        this.nomeMedico = sc.next();
    }
    
    //Getters

    public int getAmostra(){
        return this.quantidade;
    }
    public String getData(){
        return this.data.mostra1();
    }
    public String getHora(){
        return this.hora.getHora1();
    }
    public String getNomePaciente(){
        return this.nomePaciente;
    }
    public String getNomeMedico() {
        return this.nomeMedico;
    }

}
