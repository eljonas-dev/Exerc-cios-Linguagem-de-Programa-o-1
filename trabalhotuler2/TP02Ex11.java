package trabalhotuler2;

import java.util.Scanner;

public class TP02Ex11 {
/*
João Victor dos Santos & Luis Tiago Ferreira

Questão 11:
Entrar com uma matriz quadrada (máx 10x10) e calcular seu determinante.
*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        do {
            System.out.print("Digite a ordem da matriz (máx 10): ");
            n = sc.nextInt();
        } while (n > 10);

        double[][] matriz = new double[n][n];

        System.out.println("Digite os valores da matriz:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = sc.nextDouble();
            }
        }

        double det = 1;

        for (int i = 0; i < n; i++) {
            if (matriz[i][i] == 0) {
                det = 0;
                break;
            }

            for (int j = i + 1; j < n; j++) {
                double fator = matriz[j][i] / matriz[i][i];
                for (int k = i; k < n; k++) {
                    matriz[j][k] -= fator * matriz[i][k];
                }
            }
            det *= matriz[i][i];
        }

        System.out.println("\nDeterminante: " + det);

        sc.close();
    }
}