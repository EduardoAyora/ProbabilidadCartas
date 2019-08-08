/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Modelo.Carta;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Karen
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Carta> robar = new ArrayList<>();
        
        /*Para Rumiiiiiii
        for(int i = 1; i < 5; i++){
            for(int j = 1; j < 8; j++){
                Carta carta = new Carta(j, i);
                robar.add(carta);
            }
            for(int j = 11; j < 14; j++){
                Carta carta = new Carta(j, i);
                robar.add(carta);
            }
        }*/
        
        for(int i = 1; i < 5; i++){
            for(int j = 1; j < 14; j++){
                Carta carta = new Carta(j, i);
                robar.add(carta);
            }
        }
        System.out.println(robar);
        
        
    }
    
}
