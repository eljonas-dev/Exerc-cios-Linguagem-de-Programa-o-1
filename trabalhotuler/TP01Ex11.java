/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhotuler;
import java.util.*;
/**
 *João Victor dos Santos, Luis Tiago
 * 11. A partir do diâmetro de um círculo que será digitado, calcular e exibir sua área.
 */
public class TP01Ex11 {

    static void start() {
        Scanner sc = new Scanner(System.in);
        double diametro;
        System.out.println("Vamos calcular a área de um círculo!");
        System.out.print("Insira um valor para o DIÂMETRO: ");
        diametro = sc.nextDouble();

        System.out.println("A área do círculo é: " + (Math.PI * Math.pow((diametro) / 2, 2)));
    }
}
