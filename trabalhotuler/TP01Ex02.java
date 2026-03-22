/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhotuler;
import java.util.*;
/**
 *
 * @author franr
 */
public class TP01Ex02 {
    static void start() {
        Scanner sc = new Scanner(System.in);
        double aresta = 0;
        double area = 0;
        System.out.print("Digite a aresta do quadrado: ");
        aresta = sc.nextDouble();
        area = (aresta * aresta);
        System.out.println("A area do quadrado é " + area);
    }
}
