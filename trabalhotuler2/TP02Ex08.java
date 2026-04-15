package trabalhotuler2;

import java.util.Scanner;

public class TP02Ex08 {
/*
João Victor dos Santos & Luis Tiago Ferreira

Questão 8:
Entrar via teclado com doze valores e armazená-los em uma matriz de ordem 3x4.
Após a digitação dos valores solicitar uma constante multiplicativa, que deverá
multiplicar cada valor matriz e armazenar o resultado em outra matriz de mesma ordem,
nas posições correspondentes. Exibir as matrizes na tela.
*/

    public static void teste() {
        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[3][4];
        int[][] resultado = new int[3][4];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("Digite os valores da matriz 3x4:");
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.print("Digite a constante: ");
        int k = sc.nextInt();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                resultado[i][j] = matriz[i][j] * k;
            }
        }

        System.out.println("\nMatriz original:");
        for (int[] linha : matriz) {
            for (int val : linha) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }

        System.out.println("\nMatriz resultante:");
        for (int[] linha : resultado) {
            for (int val : linha) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }

    }
}