/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exporta;

/**
 *
 * @author aluno
 */
public class Porta {
    char aberta;
    String cor;
    double dimensaoX;
    double dimensaoY;
    double dimensaoZ;
    public void abre() {
        aberta = 's';
    }
    public void fecha() {
        aberta = 'n';
    }
    public void pinta(String s) {
        cor = s;
    }
    public boolean estaAberta() {
        if (aberta == 's') {
            return true;
        }
        else {
            return false;
        }
    }
    public Porta(char aberta, String cor, double dimensaoX, double dimensaoY, double dimensaoZ) {
        this.aberta = aberta;
        this.cor = cor;
        this.dimensaoX = dimensaoX;
        this.dimensaoY = dimensaoY;
        this.dimensaoZ = dimensaoZ;
    }
}
