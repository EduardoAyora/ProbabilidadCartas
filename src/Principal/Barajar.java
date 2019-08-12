/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Modelo.Carta;
import java.util.List;

/**
 *
 * @author Karen
 */
public class Barajar {
    
    public void rellenarPoker(List<Carta> mazoMesa){
        for(int i = 1; i < 5; i++){
            for(int j = 1; j < 14; j++){
                Carta carta = new Carta(j, i);
                mazoMesa.add(carta);
            }
        }
    }
    
    public void rellenarRumi(List<Carta> mazoMesa){
        for(int i = 1; i < 5; i++){
            for(int j = 1; j < 8; j++){
                Carta carta = new Carta(j, i);
                mazoMesa.add(carta);
            }
            for(int j = 11; j < 14; j++){
                Carta carta = new Carta(j, i);
                mazoMesa.add(carta);
            }
        }
    }
    
    public void repartirJugador(List<Carta> mazoMesa, List<Carta> mano){
        for(int i = 0; i < 5; i++){
            int posicionCarta = (int) (Math.random()*mazoMesa.size());
            mano.add(mazoMesa.get(posicionCarta));
            mazoMesa.remove(posicionCarta);
        }
        //System.out.println(mano);
        //System.out.println(mazoMesa);
    }
    
}
