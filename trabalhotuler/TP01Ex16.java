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
public class TP01Ex16 {

    static void start() {
        Scanner sc = new Scanner(System.in);
        double n;

        System.out.print("Insira o valor de um ÂNGULO: ");
        n = sc.nextDouble();

        double rad = Math.toRadians(n);

        System.out.println("O seno desse ângulo é: " + Math.sin(rad));
        System.out.println("O coseno desse ângulo é: " + Math.cos(rad));
        System.out.println("A tangente desse ângulo é: " + Math.tan(rad));
        System.out.println("O secante desse ângulo é: " + (1 / Math.cos(rad)));
    }
}
