package trabalhotuler2;

import java.util.Scanner;

public class TP02Ex10 {
/*
João Victor dos Santos & Luis Tiago Ferreira

Questão 10:
Entrar com uma matriz quadrada (máx 10x10) e calcular sua matriz inversa.
*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        do {
            System.out.print("Digite a ordem da matriz (máx 10): ");
            n = sc.nextInt();
        } while (n > 10);

        double[][] matriz = new double[n][n];
        double[][] identidade = new double[n][n];

        System.out.println("Digite os valores da matriz:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = sc.nextDouble();
                identidade[i][j] = (i == j) ? 1 : 0;
            }
        }

        // Gauss-Jordan
        for (int i = 0; i < n; i++) {
            double pivô = matriz[i][i];

            for (int j = 0; j < n; j++) {
                matriz[i][j] /= pivô;
                identidade[i][j] /= pivô;
            }

            for (int k = 0; k < n; k++) {
                if (k != i) {
                    double fator = matriz[k][i];
                    for (int j = 0; j < n; j++) {
                        matriz[k][j] -= fator * matriz[i][j];
                        identidade[k][j] -= fator * identidade[i][j];
                    }
                }
            }
        }

        System.out.println("\nMatriz inversa:");
        for (double[] linha : identidade) {
            for (double val : linha) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }

        sc.close();
    }
}