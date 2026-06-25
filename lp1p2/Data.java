/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp04.lp1p2;

/**
 *
 * @author PICHAU
 */
import java.util.*;
import java.text.DateFormat;
/**
 *
 */
public class Data {
    private int dia;
    private int mes;
    private int ano;
    
    //Construtores
    Data() {
        Scanner sc = new Scanner(System.in); 
        int d = 0, m = 0, a = 0;
            
        //Validação ano
        while (true) {
            System.out.print("Insira o ano: ");
            a = sc.nextInt();
            if (a >= 1) {
                break;
            }
            System.out.println("Valor digitado não é um ano válido!");
            System.out.println("--------------------------------");
        }
        this.ano = a;
        
        //Validação mês
        while (true) {
            System.out.print("Insira o número referente ao mês: ");
            m = sc.nextInt();
            if (m >= 1 && m <= 12) {
                break;
            }
            System.out.println("Valor digitado não é um mês válido!");
            System.out.println("--------------------------------");
        }
        this.mes = m;
        
        //Validação dia
        boolean datafalsa = false;
        while (datafalsa == false) {
            System.out.print("Insira o dia: ");
            d = sc.nextInt();
            switch (m){
                case 1:case 3:case 5:case 7: case 8:case 10:case 12:
                    if (d >= 1 && d <= 31) {
                        datafalsa = true;
                    }
                    break;
                case 4:case 6:case 9:case 11:
                    if (d >= 1 && d <= 30) {
                        datafalsa = true;
                    }
                    break;
                case 2:
                    if (bissexto()) {
                        if (d >= 1 && d <= 29) {
                        datafalsa = true;
                        }
                    } else {
                        if (d >= 1 && d <= 28) {
                        datafalsa = true;
                        }
                    }
                    break;
            }
            if (datafalsa == false) {
                System.out.println("Dia digitado é inválido para o mês " + this.mes + " e ano " + this.ano + " atuais!");
                System.out.println("--------------------------------"); 
            }

        }
        
        this.dia = d;
        
                
    }
    Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    
    //Setters (com parâmetros)
     public void setDia(int d)  {
         this.dia = d;
     }
     public void setMes(int m) {
         this.mes = m;
     }
     public void setAno(int a) {
         this.ano = a;
     }
     
    //Setters (sem parâmetros)
    public void setAno() {
        int a = 0;
        Scanner sc = new Scanner(System.in);
            while (true) {
            System.out.print("Insira o ano: ");
            a = sc.nextInt();
            if (a >= 1) {
                break;
            }
            System.out.println("Valor digitado não é um ano válido!");
            System.out.println("--------------------------------");
        }
            this.ano = a;
    }
    
    public void setMes() {
        int m = 0;
        Scanner sc = new Scanner(System.in);
            while (true) {
            System.out.print("Insira o número referente ao mês: ");
            m = sc.nextInt();
            if (m >= 1 && m <= 12) {
                if (validarDataTemp(this.dia, m, this.ano)) {
                    break;
                } else {
                    System.out.println("O mês informado é incompatível com o dia " + this.dia + "atualmente salvo");
                }
            } else {
            System.out.println("Valor digitado não é um mês válido!");
            System.out.println("--------------------------------");
            }
        }
        this.mes = m;
    }
    public void setDia() {
        int d = 0;
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print("Insira o número referente ao dia: ");
            d = sc.nextInt();
            
            if (validarDataTemp(d, this.mes, this.ano)) {
                break;
            } else {
            System.out.println("Dia digitado é inválido para o mês " + this.mes + " e ano " + this.ano + " atuais!");
            System.out.println("--------------------------------");    
            }
        }
        this.dia = d;
    }

     
    //Getters
    public int getDia(){
        return this.dia;
    }
    public int getMes() {
        return this.mes;
    }
    public int getAno(){
        return this.ano;
    }
    
    //Métodos auxiliares
    public String mostra1() {
        String strDia = "";
        String strMes = "";
        String strAno = "";
        
        if (this.dia < 10) {
            strDia = "0" + this.dia;
        } else {
            strDia = "" + this.dia;
        }
        
        if (this.mes < 10) {
            strMes = "0" + this.mes;
        }  else {
            strMes = "" + this.mes;
        }
        
        strAno = "" + this.ano;
        
        return strDia + "/" + strMes + "/" + strAno;
    }
    public String mostra2() {
        String strDia = "";
        String strMes = "";
        String strAno = "";
        
        if (this.dia < 10) {
            strDia = "0" + this.dia;
        } else {
            strDia = "" + this.dia;
        } 
       
        switch (this.mes) {
            case 1:
                strMes = "Janeiro";
                break;
            case 2:
                strMes = "Fevereiro";
                break;
            case 3:
                strMes = "Março";
                break;
            case 4:
                strMes = "Abril";
                break;
            case 5:
                strMes = "Maio";
                break;
            case 6:
                strMes = "Junho";
                break;
            case 7:
                strMes = "Julho";
                break;
            case 8:
                strMes = "Agosto";
                break;
            case 9:
                strMes = "Setembro";
                break;
            case 10:
                strMes = "Outubro";
                break;
            case 11:
                strMes = "Novembro";
                break;
            case 12:
                strMes = "Dezembro";
                break;
        }
        
        strAno = "" + this.ano;
        return strDia + "/" + strMes + "/" + strAno;
    }
    
    public boolean bissexto() {
        return (this.ano % 4 == 0 && this.ano % 100 !=0) || (this.ano %400 == 0);
    }
    
    public int diasTranscorridos() {
        int totalDias = 0;
        
        switch (this.mes -1) {
            case 11: totalDias += 30;
            case 10: totalDias += 31;
            case 9: totalDias += 30;
            case 8: totalDias += 31;
            case 7: totalDias += 31;
            case 6: totalDias += 30;
            case 5: totalDias += 31;
            case 4: totalDias += 30;
            case 3: totalDias += 31;
            case 2:
                if(bissexto()) {
                    totalDias += 29;
                } else{
                    totalDias += 28;
                }
            case 1: totalDias += 31;
        }
        
        totalDias += this.dia;
        return totalDias;
    }
    
    public void apresentaDataAtual() {
        Date dataAtual = new Date();
        
        DateFormat formatador = DateFormat.getDateInstance(DateFormat.FULL);
        
        System.out.println("A data atual é: " + formatador.format(dataAtual));
    }
    
    private boolean validarDataTemp(int d, int m, int a) {
        if(m < 1 || m > 12 || d < 1) return false;
        
        int limiteDias;
            switch (m){
                case 1:case 3:case 5:case 7: case 8:case 10:case 12:
                    limiteDias = 31;
                    break;
                case 4:case 6:case 9:case 11:
                    limiteDias = 30;
                    break;
                case 2:
                    if ((a % 4 == 0 && a % 100 !=0) || (a %400 == 0)) {
                        limiteDias = 29;
                    } else {
                        limiteDias = 28;
                    }
                    break;
                default:
                    return false;
            }
            return d <= limiteDias;
    }
}
