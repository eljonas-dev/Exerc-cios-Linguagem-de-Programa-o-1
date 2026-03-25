/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhotuler;
import java.util.*;
/**
 *João Victor dos Santos, Luis Tiago
 * 15. Entrar via teclado com o valor da cotação do dólar e uma certa quantidade de
dólares. Calcular e exibir o valor correspondente em Reais (R$).
 */
public class TP01Ex15 {

    static void start() {
        Scanner sc = new Scanner(System.in);
        double dollar;

        System.out.println("Vamos converter DÓLARES para REAIS!!!");
        System.out.print("Insira a quantia em DÓLAR: ");
        dollar = sc.nextDouble();

        System.out.println("O valor equivalente em REAIS será de: " + dollar * 5.31 + " reais");

    }
}
