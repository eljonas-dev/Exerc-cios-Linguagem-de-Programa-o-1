/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exporta;
import java.util.*;
/**
 *
 * @author aluno
 */
public class ExPorta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Porta porta = new Porta('n', "preto", 30, 200, 4);
        int resposta = 0;
        while (true) {
            System.out.println("Bem vindo ao sistema de porta. Digite um número referente à ação que deseja executar!");
            System.out.println("1. Abrir porta");
            System.out.println("2. Fechar porta");
            System.out.println("3. Pintar porta");
            System.out.println("4. Perguntar se a porta está aberta ou não");
            System.out.println("-------------------------------------");
            
            Scanner sc = new Scanner(System.in);
            resposta = sc.nextInt();
            
            switch (resposta) {
                case 1:
                    porta.abre();
                    break;
                case 2:
                    porta.fecha();
                    break;
                case 3:
                    System.out.println("Qual a cor que deseja pintar? ");
                    porta.pinta(sc.next());
                    break;
                case 4:
                    
                    if (porta.estaAberta() == true){
                        System.out.println("SIM, A porta está aberta!");
                    }
                    else {
                        System.out.println("Não, ela está fechada!");
                    }
            }
            
        }
    }
    
}
