/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhotuler;
import java.util.*;
/**
 *João Victor dos Santos, Luis Tiago
 * 12. Calcular e exibir o volume de um cone a partir dos valores da altura e do raio da
base que serão digitados.
 * @author franr
 */
public class TP01Ex12 {
    static void start() {
        Scanner sc = new Scanner(System.in);
        double h, r;

        System.out.println("Vamos calcular o VOLUME de um CONE!");
        System.out.print("Insira o valor da ALTURA: ");
        h = sc.nextDouble();

        System.out.print("Insira o valor do RAIO DA BASE: ");
        r = sc.nextDouble();

        System.out.println("O VOLUME do CUBO será de: " + (1.0 / 3) * Math.PI * Math.pow(r, 2) * h);

    }
}
