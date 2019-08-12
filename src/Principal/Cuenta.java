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
    
    public boolean repeticiones(List<Carta> mano){
        Set<CartaRepetida> repetidas = new HashSet<>();
        for(int i = 0; i < mano.size(); i++){
            int numero = mano.get(i).getNumero();
            CartaRepetida cartaRepetida = new CartaRepetida(numero);
            repetidas.add(cartaRepetida);
        }
        for(CartaRepetida cartaRepetida : repetidas){
            System.out.println(cartaRepetida.getRepeticion());
            if(cartaRepetida.getRepeticion() == 2){
                return true;
            }
        }
        return false;
    }
    
}
