/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Karen
 */
public class Carta {
    
    private int numero;
    private int palo;

    public Carta(int numero, int palo) {
        this.numero = numero;
        this.palo = palo;
    }

    public int getNumero() {
        return numero;
    }

    public int getPalo() {
        return palo;
    }
    
    @Override
    public String toString() {
        return "  {" + "numero=" + numero + ", palo=" + palo + '}';
    }
    
}
