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
        
        Barajar barajar = new Barajar();
        
        
        double cf = 0; //Cuentas a favor, dejar en cero
        double ct = 1000000; //Total de repeticiones
        
        for (int i = 0; i < ct; i++) {
            Cuenta cuenta = new Cuenta();
            List<Carta> mazoMesa = new ArrayList<>();
            List<Carta> mano = new ArrayList<>();
            //Baraja llena
            barajar.rellenarPoker(mazoMesa);
            
            //Rellenando mano
            barajar.repartirJugador(mazoMesa, mano);
            
            //Verificar si hay dos repetidas
            cuenta.rellenarRepetidas(mano);
            if (cuenta.repeticiones()) {
                cf++;
            }
        }
        
        //System.out.println(cf);
        double prob = cf / ct;
        prob *= 100;

        System.out.println("Probabilidad : " + prob);
    }

}
