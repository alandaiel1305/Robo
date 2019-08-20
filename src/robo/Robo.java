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
public class Robo {

    private int linha;
    private int coluna;

    Ambiente sala = new Ambiente();

    public Robo(int linha, int coluna, Ambiente sala) {
        this.linha = linha;
        this.coluna = coluna;
        this.sala = sala;
    }

    public Robo() {
    }

    public void mostrarPosicao() {
          System.out.println("A sala tem tamanho: (" + sala.getQtdLinhas()+", "+ sala.getQtdColunas()+")");
    }

    public void andarFrente() {

    }

    public void andarTras() {

    }

    public void parar() {

    }

    public void virarDireita() {

    }

    public void virarEsquerda() {

    }

}
