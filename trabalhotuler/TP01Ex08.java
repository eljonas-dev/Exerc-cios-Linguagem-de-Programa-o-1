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
public class TP01Ex08 {
    static void start(){
    	Scanner sc = new Scanner(System.in);
        double milha;
        System.out.println("Me diga um valor de MILHAS MARÍTMAS que eu converterei em QUILÔMETROS!!!");
        milha = sc.nextDouble();
        System.out.println("O valor em quilômetros é: " + (milha * 1.852));
    }
}
