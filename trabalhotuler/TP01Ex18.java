/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhotuler;
import java.util.*;
/**
 *João Victor dos Santos, Luis Tiago
 * 18. Entrar via teclado com o valor de cinco produtos. Após as entradas, digitar um
valor referente ao pagamento da somatória destes valores. Calcular e exibir o troco
que deverá ser devolvido.
 */
public class TP01Ex18 {

    static void start() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Você entrou no CARREFOUR!");
        double total = 0;
        double preco = 0, pagamento = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o valor do " + (i + 1) + "° produto: ");
            preco = sc.nextDouble();

            total = total + preco;
        }
        System.out.println("O valor total a pagar será de: " + total + " reais");
        System.out.println("Insira o valor  que deseja pagar: ");
        pagamento = sc.nextDouble();

        if (pagamento > total) {
            System.out.println("Pagamento bem sucedido! Seu troco é de: " + (pagamento - total) + " reais!");
        } else if (pagamento < total) {
            System.out.println("Ops! Valor insuficiente!");
        } else {
            System.out.println("Pagamento bem sucedido! Volte sempre!");
        };

    }
}
