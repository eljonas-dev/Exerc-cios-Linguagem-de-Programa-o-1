/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exaula4;
import java.util.*;
/**
 *
 * @author aluno
 */
public class Exaula4 {

    /**
     * João Victor dos Santos, Luis Tiago Ferreira;
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor do lado do quadrado: ");
        int lado = sc.nextInt();
        
        for (int i = 0; i < lado; i++) {
            for (int j = 0; j < lado; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    
}
