/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhotuler2;
import java.util.*;
/**
 *Entrar via teclado com dez valores positivos. Consistir a digitação e enviar mensagem de erro, se necessário.
 * Após a digitação exibir:
 * a. O maior valor
 * b. A soma dos valores:
 * c. A média aritmetica dos valores
 * 
 * João Victor dos Santos, Luis Tiago Ferreira
 */
public class TP02Ex02 {
    public static void teste() {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        
        for (int i = 0; i < 10; i++) {
            do {
            System.out.println("Digite um valor para o número " + (i + 1));
            numeros[i] = sc.nextInt();
            } while (numeros[i] <= 0);
        }
        int numSoma = 0, numMaior = 0;
        
        //Soma e número maior
        for (int j = 0; j < 10; j++) {

            numSoma += numeros[j];
            if (numMaior < numeros[j]) {
                numMaior = numeros[j];
            }
        }
        System.out.println("A soma dos valores é: " + numSoma);
        
        System.out.println("O maior número é: " + numMaior);
    }
}
