/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhotuler2;
import java.util.*;
/**
 *Armazenar seis valores em uma matriz de ordem 3x2. Apresentar os valores na tela.
 * 
 * João Victor dos Santos, Luis Tiago Ferreira
 */
public class TP02Ex05 {
    public static void teste() {
        int[][] numeros = new int[3][2];
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("Insira um valor: ");
                numeros[i][j] = sc.nextInt();
            }
        }
        System.out.println("--------------------------------");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(numeros[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
