/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhotuler;
import java.util.*;
/**
 *João Victor dos Santos, Luis Tiago
 6. Calcular e exibir a média aritmética de quatro valores quaisquer que serão
digitados.
 */
//CORRIGIDO!
public class TP01Ex6 {

    static void start() {
        Scanner sc = new Scanner(System.in);
        double n1 = 0, n2 = 0, n3 = 0, n4 = 0;
        System.out.println("Vamos calcular a média aritmética entre 4 números! ");

        System.out.print("Insira o valor 1: ");
        n1 = sc.nextDouble();

        System.out.print("Insira o valor 2: ");
        n2 = sc.nextDouble();

        System.out.print("Insira o valor 3: ");
        n3 = sc.nextDouble();

        System.out.print("Insira o valor 4: ");
        n4 = sc.nextDouble();

        System.out.println("A média dos 4 valores é: " + ((n1 + n2 + n3 + n4) / 4));
    }
}
