/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhotuler2;
import java.util.*;
/**
 *Entrar com dois valores via teclado onde segundo valor deverá ser maior que o primeiro, caso 
 * contrário solicitar novamente apenas o segundo valor
 * 
 * João Victor dos Santos, Luis Tiago Ferreira
 */
public class TP02Ex01 {
    public static void teste() {
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro valor: ");
        num1 = sc.nextInt();
        
        do {
        System.out.print("Digite o segundo valor: ");
        num2 = sc.nextInt();
        } while (num2 <= num1);
        
    }
}
