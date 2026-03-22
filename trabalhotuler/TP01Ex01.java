/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhotuler;

/**
 *
 * @author franr
 */
import java.util.*;
public class TP01Ex01 {
    static void start() {
       Scanner sc = new Scanner(System.in);
       double base = 0;
       double altura = 0;
       double area = 0;
       System.out.print("Digite a altura do retângulo: ");
       base = sc.nextDouble();
       System.out.print("Digite a altura do retângulo: ");
       altura = sc.nextDouble();
       area = base * altura;
       System.out.println("A area do retângulo é " + area);
    }
}
