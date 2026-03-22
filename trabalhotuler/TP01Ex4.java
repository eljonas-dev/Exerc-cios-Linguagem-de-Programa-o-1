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
public class TP01Ex4 {

    static void start() {
        Scanner sc = new Scanner(System.in);
        double base = 0;
        double altura = 0;
        double area = 0;
        System.out.print("Digite a base do triângulo: ");
        base = sc.nextDouble();
        System.out.print("Digite a altura do triângulo: ");
        altura = sc.nextDouble();
        area = (base * altura) / 2;
        System.out.println("A area do triângulo é " + area);
    }
}
