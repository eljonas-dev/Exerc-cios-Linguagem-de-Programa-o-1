/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhotuler;
import java.util.*;
/**
 *João Victor dos Santos, Luis Tiago
 *9. Calcular e exibir a tensão de um determinado circuito eletrônico a partir dos
valores da resistência e corrente elétrica que serão digitados. Utilize a lei de Ohm.
 */
//CORRIGIDO
public class TP01Ex09 {
    static void start(){
    	Scanner sc = new Scanner(System.in);
        double r, i;
        System.out.println("Vamos calcular o valor de uma determinada tensão elétrica!");
        System.out.print("Insira um valor para a RESISTÊNCIA: ");
        r = sc.nextDouble();
        
        System.out.print("Insira um valor para a CORRENTE: ");
        i = sc.nextDouble();
        
        System.out.println("A tensão elétrica será de: " +  (r * i));
    }
}
