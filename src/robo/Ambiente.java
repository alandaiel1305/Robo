/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robo;

/**
 *
 * @author anluhor
 */
public class Ambiente {

    private int qtdLinhas;
    private int qtdColunas;


    public Ambiente(int qtdLinhas, int qtdColunas) {
        this.qtdColunas = qtdColunas;
        this.qtdLinhas = qtdLinhas;
    }

    public Ambiente() {
    }

    public int getQtdLinhas() {
        return qtdLinhas;
    }

    public void setQtdLinhas(int qtdLinhas) {
        this.qtdLinhas = qtdLinhas;
    }

    public int getQtdColunas() {
           return qtdColunas;
    }

    public void setQtdColunas(int qtdColunas) {
        this.qtdColunas = qtdColunas;
    }

}
