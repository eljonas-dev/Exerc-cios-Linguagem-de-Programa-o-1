/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhotuler2;
import java.util.*;
/**
 *Armazenar seis nomes em uma matriz de ordem 2x3. Apresentar os nomes na tela.
 * 
 * João Victor dos Santos, Luis Tiago Ferreira
 */
public class TP02Ex06 {
    public static void teste() {
        Scanner sc = new Scanner(System.in);
        String[][] nomes = new String[2][3];
        
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Digite um nome: ");
                nomes[i][j] = sc.next();
            }
        } 
        System.out.println("--------------------------------");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(nomes[i][j] + ", ");
            }
            System.out.println("");
        }
    }
}
