/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robo;

import java.util.Scanner;

/**
 *
 * @author anluhor
 */
public class TestarRobo {

    Robo mig;
    Ambiente sala;  
    
    Scanner entrada = new Scanner(System.in);

    public void definirAmbiente() {
        System.out.println("Informe o tamanho do ambiente(quantidade de linhas e colunas): ");
        sala = new Ambiente(entrada.nextInt(), entrada.nextInt());
    }

    public void iniciarRobo() {
        System.out.println("Informe o tamanho do ambiente(quantidade de linhas e colunas): ");
        mig = new Robo(entrada.nextInt(), entrada.nextInt(), sala);
    }

    public void menu() {  
        mig.mostrarPosicao();
    }
}
