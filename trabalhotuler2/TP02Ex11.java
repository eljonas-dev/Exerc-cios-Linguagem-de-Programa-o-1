package trabalhotuler2;

import java.util.Scanner;

public class TP02Ex11 {

    /*
    João Victor dos Santos & Luis Tiago Ferreira

    Questão 11:
    Entrar com uma matriz quadrada (máx 10x10) e calcular seu determinante.
    */

    public static void teste() {
        Scanner sc = new Scanner(System.in);

        int n;
        do {
            System.out.print("Digite a ordem da matriz (máx 10): ");
            n = sc.nextInt();
        } while (n > 10 || n <= 0);

        double[][] matriz = new double[n][n];

        System.out.println("Digite os valores da matriz:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = sc.nextDouble();
            }
        }

        double det = 1;
        int trocas = 0;

        for (int i = 0; i < n; i++) {

            // Se pivô for zero (ou muito próximo), tenta trocar linha
            if (Math.abs(matriz[i][i]) < 1e-9) {
                int linhaTroca = -1;

                for (int j = i + 1; j < n; j++) {
                    if (Math.abs(matriz[j][i]) > 1e-9) {
                        linhaTroca = j;
                        break;
                    }
                }

                // Se não encontrou linha para trocar → determinante = 0
                if (linhaTroca == -1) {
                    det = 0;
                    break;
                }

                // Troca de linhas
                double[] temp = matriz[i];
                matriz[i] = matriz[linhaTroca];
                matriz[linhaTroca] = temp;

                trocas++;
            }

            // Eliminação (zerar abaixo da diagonal)
            for (int j = i + 1; j < n; j++) {
                double fator = matriz[j][i] / matriz[i][i];
                for (int k = i; k < n; k++) {
                    matriz[j][k] -= fator * matriz[i][k];
                }
            }

            det *= matriz[i][i];
        }

        // Ajusta sinal pelas trocas de linha
        if (trocas % 2 != 0) {
            det *= -1;
        }

        System.out.println("\nDeterminante: " + det);

        sc.close();
    }

    public static void main(String[] args) {
        teste();
    }
}