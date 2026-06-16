/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp04;

/**
 *Exercício 02
Agora, desenvolva um programa capaz de testar a classe e os métodos desenvolvidos no
exercício anterior.
* 
 * João Victor dos Santos, Luis Tiago Ferreira
 */
public class TP04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         System.out.println("--- Instanciando Objeto d1 da classe Data (Teclado) ---");
         Data d1 = new Data();
         
        System.out.println("\nResultados do primeiro objeto:");
        System.out.println("Dia: " + d1.retDia());
        System.out.println("Mês: " + d1.retMes());
        System.out.println("Ano: " + d1.retAno());
        
        System.out.println("\n--- Instanciando Objeto d2 (03/06/2006) ---");
        Data d2 = new Data(3, 6, 2006);
        System.out.println("Dia: " + d2.retDia());
        System.out.println("Mês: " + d2.retMes());
        System.out.println("Ano: " + d2.retAno());
        
        System.out.println("\n--- Alterando dados de d2 via teclado ---");
        d2.entraDia(); 
        d2.entraMes();  
        d2.entraAno();
        
        System.out.println("\nValores atualizados de d2:");
        System.out.println("Formato 1: " + d2.mostra1());
        System.out.println("Formato 2: " + d2.mostra2());
        
        System.out.println("\n--- Teste dos Getters individuais (d2) ---");
        System.out.println("Dia obtido: " + d2.retDia());
        System.out.println("Mês obtido: " + d2.retMes());
        System.out.println("Ano obtido: " + d2.retAno());
    }
    
}
