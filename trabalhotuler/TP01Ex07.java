/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhotuler;
import java.util.*;
/**
 *João Victor dos Santos, Luis Tiago
 * 7. Calcular e exibir a média geométrica de dois valores quaisquer que serão
digitados.
 */
public class TP01Ex07 {

    static void start() {
        Scanner sc = new Scanner(System.in);
        double n1 = 0, n2 = 0;
        System.out.println("Vamos calcular a média geométrica entre 2 valores");

        System.out.print("Insira o primeiro valor: ");
        n1 = sc.nextInt();

        System.out.print("Insira o segundo valor: ");
        n2 = sc.nextInt();

        System.out.println("A média geométrica desses dois valores é: " + (Math.sqrt(n1 * n2)));

    }
}
