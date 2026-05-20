/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp03ex01;
//João Victor dos Santos Pereira, Luis Tiago Ferreira
/**
 *
 * @author aluno
 */
public class Tp03ex01 {

    public static void main(String[] args) {
        
        System.out.println("--- Instanciando Objeto h1 (Teclado) ---");
        Hora h = new Hora();
        
        System.out.println("\nResultados do primeiro objeto:");
        System.out.println("Formato 1: " + h.getHora1());
        System.out.println("Formato 2: " + h.getHora2());
        System.out.println("Segundos totais: " + h.getSegundos());
        
        System.out.println("\n--- Instanciando Objeto h2 (15:05:01) ---");
        Hora h2 = new Hora(15, 5, 1);
        System.out.println("Formato 1: " + h2.getHora1());
        System.out.println("Formato 2: " + h2.getHora2());
        System.out.println("Segundos totais: " + h2.getSegundos());
        

        System.out.println("\n--- Alterando dados de h2 via teclado ---");
        h2.setHora(); 
        h2.setMin();  
        h2.setSeg();  
        
        System.out.println("\nValores atualizados de h2:");
        System.out.println("Formato 1: " + h2.getHora1());
        System.out.println("Formato 2: " + h2.getHora2());
        
        System.out.println("\n--- Teste dos Getters individuais (h2) ---");
        System.out.println("Hora obtida: " + h2.getHora());
        System.out.println("Minuto obtido: " + h2.getMin());
        System.out.println("Segundo obtido: " + h2.getSeg());
    }   
}
}
