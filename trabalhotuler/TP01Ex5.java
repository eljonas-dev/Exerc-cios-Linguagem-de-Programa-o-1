/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhotuler;
import java.util.*;
/**
 *João Victor dos Santos, Luis Tiago
 * 5. Calcular e exibir o volume de uma esfera a partir do valor de seu diâmetro que
será digitado.
 */
public class TP01Ex5 {

    static void start() {
        Scanner sc = new Scanner(System.in);
        double diametro = 0;

        System.out.println("Agora, vamos cálcular a área de uma esfera!");

        System.out.print("Insira o valor do diâmetro da esfera: ");
        diametro = sc.nextInt();

        double raio = diametro / 2;
        System.out.println("A área da esfera é: " + (4 * Math.PI * Math.pow(raio, 2)));

    }
}
