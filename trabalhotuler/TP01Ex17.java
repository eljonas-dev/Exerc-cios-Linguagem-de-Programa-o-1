/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhotuler;
import java.util.*;
/**
 *João Victor dos Santos, Luis Tiago.
 * 17. Entrar via teclado com dois valores quaisquer “X” e “Y”. Calcular e exibir o
cálculo XY (“X” elevado a “Y”). Pesquisar as funções Exp e Ln.
 * @author franr
 */
public class TP01Ex17 {

    static void start() {
        Scanner sc = new Scanner(System.in);
        double base, expoente;
        System.out.println("Vamos CALCULAR uma POTENCIAÇÃO entre dois valores!!!!");

        System.out.print("Insira o valor da base: ");
        base = sc.nextDouble();

        System.out.print("Insira o valor do expoente: ");
        expoente = sc.nextDouble();

        System.out.println("O resultado da potenciação será de: " + Math.pow(base, expoente));
    }
}
