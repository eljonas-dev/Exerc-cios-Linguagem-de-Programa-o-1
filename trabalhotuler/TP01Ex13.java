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
public class TP01Ex13 {

    static void start() {
        Scanner sc = new Scanner(System.in);
        double v0 = 0;
        double a = 0;
        double t = 0;
        double vFinal = 0;
        System.out.print("Digite a velocidade inicial: ");
        v0 = sc.nextDouble();
        System.out.print("Digite a aceleracao: ");
        a = sc.nextDouble();
        System.out.print("Digite o tempo de percurso em minutos: ");
        t = sc.nextDouble();
        vFinal = v0 + (a * t);
        vFinal = vFinal * 3.6;
        System.out.println("A velocidade final em km/h é: " + vFinal);
    }
}
