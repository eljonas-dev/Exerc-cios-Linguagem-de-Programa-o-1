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
public class TP01Ex14 {

    static void start() {
        Scanner sc = new Scanner(System.in);
        double r = 0;
        double a = 0;
        double vCubo = 0;
        double vEsfera = 0;
        double vLivre = 0;
        System.out.print("Digite o raio da esfera: ");
        r = sc.nextDouble();
        System.out.print("Digite a aresta do cubo: ");
        a = sc.nextDouble();
        vCubo = Math.pow(a, 3);
        vEsfera = (4.0 / 3.0) * Math.PI * Math.pow(r, 3);
        vLivre = vCubo - vEsfera;
        System.out.println("O volume livre do ambiente é: " + vLivre);
    }
}
