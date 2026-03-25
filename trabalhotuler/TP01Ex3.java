/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhotuler;
import java.util.*;
/**
 *João Victor dos Santos, Luis Tiago
 * 3. Calcular e exibir a área de um quadrado a partir do valor de sua diagonal que será
digitado.
 */
public class TP01Ex3 {

    static void start() {
        Scanner sc = new Scanner(System.in);
        double diagonal = 0;
        double area = 0;
        System.out.print("Digite a diagonal do quadrado: ");
        diagonal = sc.nextDouble();
        area = (diagonal * diagonal) / 2;
        System.out.println("A area do quadrado é " + area);
    }
}
