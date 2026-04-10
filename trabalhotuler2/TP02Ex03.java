/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhotuler2;
import java.util.*;
/**
 *Entrar via teclado com “N” valores quaisquer. O valor “N” (que representa a quantidade de
números) será digitado, deverá ser positivo, porém menor que vinte. Caso a quantidade não
satisfaça a restrição, enviar mensagem de erro e solicitar o valor novamente. Após a
digitação dos “N” valores, exibir:
a. O maior valor; (FEITO)
b. O menor valor; (FEITO)
c. A soma dos valores; (FEITO)
d. A média aritmética dos valores; (FEITO)
e. A porcentagem de valores que são positivos; (FEITO)
f. A porcentagem de valores negativos; (FEITO)
 * 
 * João Victor dos Santos, Luis Tiago Ferreira
 * 
 * Após exibir os dados, perguntar ao usuário de deseja ou não uma nova execução do
programa. Consistir a resposta no sentido de aceitar somente “S” ou “N” e encerrar o
programa em função dessa resposta. (FEITO)
 */
public class TP02Ex03 {
    public static void teste() {
        
        while (true) {
        int tamanho = 0;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantos números deseja digitar? ");
        tamanho = sc.nextInt();
        
        while (tamanho <= 0 || tamanho >= 20) {
            System.out.println("Número não permitido, por favor insira outro valor!");
            tamanho = sc.nextInt();
        }
        
        int[] numeros = new int[tamanho];
        
        //definindo valores
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Insira o valor referente ao número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
            }
        
        int numMaior = 0, numMenor = numeros[0], numSoma = 0, QntP = 0, QntN = 0;
        double numPp = 0, numPn = 0;
        
        //impressão da matriz e cálculos
        for (int j = 0; j < numeros.length; j++) {
            System.out.println(numeros[j]);
            
            //Maior número
            if (numMaior < numeros[j]) {
                numMaior = numeros[j];
            }
            
            //Menor número
            if (numMenor > numeros[j]){
                numMenor = numeros[j];
            }
            
            //Soma dos valores
            numSoma += numeros[j];
            
            //Contador de positivos e negativos (pra calcular a porcentagem)
            if (numeros[j] > 0) {
                QntP += 1;
            }
            else if (numeros[j] < 0) {
                QntN += 1;
            }
        }
        
        //impressão dos resultados
        System.out.println("-----------------------------------------------");
        System.out.println("O maior número digitado foi " + numMaior);
        System.out.println("O menor número digitado foi " + numMenor);
        System.out.println("A soma dos valores é " + numSoma);
        System.out.printf("A média aritmética dos valores é %.2f%n" , ((double) numSoma / numeros.length));
        System.out.println("A porcentagem de números positivos é de " + (((double) QntP / numeros.length)) * 100 + "%");
        System.out.println("A porcentagem de números negativos é de " + (((double) QntN / numeros.length) * 100) + "%");
        System.out.println("-----------------------------------------------");
        
        //Condição de saída do loop
        char resposta;
        do {System.out.print("Deseja continuar? (S/N)");
        resposta = Character.toUpperCase(sc.next().charAt(0)); //Tudo isso pq char não tem o método ToUpper
        } while (resposta != 'N' && resposta != 'S');
        
        if (resposta == 'N') {
            break;
        }
    }
    }
}
/*
1- parte funcional (criar a matriz de acordo com o tamanho digitado e realizar todas as operações) (FEITO)
2- Definir a parte do loop com um tratamento de resposta
*/