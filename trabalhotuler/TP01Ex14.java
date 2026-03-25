/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhotuler;
import java.util.*;
/**
 *João Victor dos Santos, Luis Tiago
 * 14. Calcular e exibir o volume livre de um ambiente que contém uma esfera de raio
“r” inscrita em um cubo perfeito de aresta “a”. Os valores de “r “ e “a” serão
digitados.
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
