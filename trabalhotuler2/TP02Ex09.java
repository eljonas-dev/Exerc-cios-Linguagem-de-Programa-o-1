package trabalhotuler2;

import java.util.Scanner;

public class TP02Ex09 {
/*
João Victor dos Santos & Luis Tiago Ferreira

Questão 9:
Entrar com uma matriz de ordem MxN (máx 10x10). Após a digitação,
calcular e exibir a matriz transposta.
*/

    public static void teste() {
        Scanner sc = new Scanner(System.in);

        int m, n;

        do {
            System.out.print("Digite o número de linhas (máx 10): ");
            m = sc.nextInt();
            System.out.print("Digite o número de colunas (máx 10): ");
            n = sc.nextInt();
        } while (m > 10 || n > 10);

        int[][] matriz = new int[m][n];
        int[][] transposta = new int[n][m];

        System.out.println("Digite os valores da matriz:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = sc.nextInt();
                transposta[j][i] = matriz[i][j];
            }
        }

        System.out.println("\nMatriz original:");
        for (int[] linha : matriz) {
            for (int val : linha) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }

        System.out.println("\nMatriz transposta:");
        for (int[] linha : transposta) {
            for (int val : linha) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }

    }
}