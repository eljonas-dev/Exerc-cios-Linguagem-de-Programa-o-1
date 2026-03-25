/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhotuler;
import java.util.*;
/**
 *João Victor dos Santos, Luis Tiago
 * 10. Entrar via teclado com o valor de uma temperatura em graus Celsius, calcular e
exibir sua temperatura equivalente em Fahrenheit.
 */
public class TP01Ex10 {
    static void start() {
        Scanner sc = new Scanner(System.in);
        double celsius;
        System.out.print("Digite uma temperatura em graus Celsius: ");
        celsius = sc.nextDouble();
        System.out.println("Esta temperatura em Fahrenheit é: " + (celsius * 1.8) + 32);
    }
}
