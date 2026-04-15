package trabalhotuler2;

import java.util.Scanner;

public class TP02Ex07 {
/*
João Victor dos Santos e Luis Tiago Ferreira
    
 Questão 7
 Entrar via teclado com doze valores e armazená-los em uma matriz de ordem 3x4. Após a
digitação dos valores solicitar uma constante multiplicativa, que deverá multiplicar cada
valor matriz e armazenar o resultado na própria matriz, nas posições correspondentes.
*/
    
    public static void teste() {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][4];

        System.out.println("Digite os valores da matriz 3x4:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.print("Digite a constante: ");
        int k = sc.nextInt();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] *= k;
            }
        }

        System.out.println("\nMatriz resultante:");
        for (int[] linha : matriz) {
            for (int val : linha) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }

    }
}