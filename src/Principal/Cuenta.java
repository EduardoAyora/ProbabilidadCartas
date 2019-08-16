/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Modelo.Carta;
import Modelo.CartaRepetida;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Karen
 */
public class Cuenta {
    
    private List<CartaRepetida> repetidas;

    public Cuenta() {
        repetidas = new ArrayList<>();
    }
    
    
    
    public void rellenarRepetidas(List<Carta> mano){
        Set<CartaRepetida> repetidasLargo = new HashSet<>();
        for(int i = 0; i < mano.size(); i++){
            int numero = mano.get(i).getNumero();
            CartaRepetida cartaRepetida = new CartaRepetida(numero);
            repetidasLargo.add(cartaRepetida);
        }
        //System.out.println("Largo: " + repetidasLargo);------
        for(CartaRepetida cartaRepetida : repetidasLargo){
            if(cartaRepetida.getRepeticion() > 1){
                repetidas.add(cartaRepetida);
            }
        }
    }
    
    public boolean repeticiones(){
        //System.out.println("Cartas repetidas: ");----
        //System.out.println(repetidas);
        for(CartaRepetida cartaRepetida : repetidas){
            //System.out.println(cartaRepetida.getRepeticion());
            if(cartaRepetida.getRepeticion() == 3){
                return true;
            }
        }
        return false;
    }
    
    //Clasificar primero ordenando por palo y de menor a mayor, luego hacer escalera, no repetir los juegos.
    public boolean escalera(List<Carta> mano){
        int a = 0;
        int b = 0;
        
        for(int i = 0; i < 2; i++){
            if(i == 0){
                
            }else{
                
            }
        }/*
        for(int i = 0; i < mano.size(); i++){
            if(mano.ge){
                
            }
        }*/
        return false;
    }
    
}
