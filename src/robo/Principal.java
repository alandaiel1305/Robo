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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        TestarRobo ta = new TestarRobo();
        
        ta.definirAmbiente();
        ta.iniciarRobo();
        ta.menu();
       
    }
    
}
