/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhotuler2;
import java.util.*;
/**
 *Armazenar seis valores em uma matriz de ordem 2x3. Apresentar os valores na tela.
 * 
 * João Victor dos Santos, Luis Tiago Ferreira
 */
public class TP02Ex04 {
    public static void teste() {
        int[][] numeros = new int[2][3]; //(x,y)
        Scanner sc = new Scanner(System.in);
        
        //Aqui é onde eu brinco
        for (int i = 0; i < 2; i ++) { //for da linha
            for (int j = 0; j < 3; j++) { //for da coluna
                System.out.print("Insira um valor: ");
                numeros[i][j] = sc.nextInt();
            }
        }
        System.out.println("--------------------------------");
        //Aqui é onde eu vejo
        for (int i = 0; i < 2; i ++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(numeros[i][j] + " ");
            }
            System.out.println(""); //só pra pular linha
        }
    }
}
