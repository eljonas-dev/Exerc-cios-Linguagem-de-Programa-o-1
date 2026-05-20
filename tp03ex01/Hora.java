package tp03ex01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Hora {
    private int hora;
    private int min;
    private int seg;
    
    public Hora() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Insira o valor da hora (0-23): ");
                int h = sc.nextInt();
                if (h >= 0 && h <= 23) {
                    this.hora = h;
                    break;
                }
                System.out.println("Hora inválida! Digite um valor entre 0 e 23.");
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida! Por favor, digite um número inteiro.");
                sc.next();
            }
        }
        
        while (true) {
            try {
                System.out.print("Insira o valor do minuto (0-59): ");
                int m = sc.nextInt();
                if (m >= 0 && m <= 59) { 
                    this.min = m;
                    break;
                }
                System.out.println("Minuto inválido! Digite um valor entre 0 e 59.");
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida! Por favor, digite um número inteiro.");
                sc.next();
            }
        }
        
        while (true) {
            try {
                System.out.print("Insira o valor do segundo (0-59): ");
                int s = sc.nextInt();
                if (s >= 0 && s <= 59) {
                    this.seg = s;
                    break;
                }
                System.out.println("Segundo inválido! Digite um valor entre 0 e 59.");
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida! Por favor, digite um número inteiro.");
                sc.next();
            }
        }
    }
    
    public Hora(int h, int m, int s) {
        this.hora = h;
        this.min = m;
        this.seg = s;
    }
    
    public void setHora(int h) { this.hora = h; }
    public void setMin(int m) { this.min = m; }
    public void setSeg(int s) { this.seg = s; }
    
    public void setHora() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Insira o novo valor da hora (0-23): ");
                int h = sc.nextInt();
                if (h >= 0 && h <= 23) {
                    this.hora = h;
                    break;
                }
                System.out.println("Hora inválida!");
            } catch (InputMismatchException e) {
                System.out.println("Digite um número válido.");
                sc.next();
            }
        }
    }
    
    public void setMin() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Insira o novo valor dos minutos (0-59): ");
                int m = sc.nextInt();
                if (m >= 0 && m <= 59) {
                    this.min = m;
                    break;
                }
                System.out.println("Minuto inválido!");
            } catch (InputMismatchException e) {
                System.out.println("Digite um número válido.");
                sc.next();
            }
        }
    }
    
    public void setSeg() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Insira o novo valor dos segundos (0-59): ");
                int s = sc.nextInt();
                if (s >= 0 && s <= 59) {
                    this.seg = s;
                    break;
                }
                System.out.println("Segundo inválido!");
            } catch (InputMismatchException e) {
                System.out.println("Digite um número válido.");
                sc.next();
            }
        }
    }
    
    public int getHora() { return this.hora; }
    public int getMin() { return this.min; }
    public int getSeg() { return this.seg; }
    
    public String getHora1() {
        return String.format("%02d:%02d:%02d", this.hora, this.min, this.seg);
    } 
    
    public String getHora2() {
        int horaConv;
        String periodo = (this.hora >= 12) ? "PM" : "AM";
        
        if (this.hora == 0) {
            horaConv = 12;
        } else if (this.hora > 12) {
            horaConv = this.hora - 12;
        } else {
            horaConv = this.hora;
        }
        return String.format("%02d:%02d:%02d (%s)", horaConv, this.min, this.seg, periodo);
    }
    
    public int getSegundos() {
        return this.seg + (this.min * 60) + (this.hora * 3600);
    }
}