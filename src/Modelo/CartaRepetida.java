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
public class CartaRepetida {
    
    private int numero;
    private int repeticion;

    public CartaRepetida(int numero) {
        this.numero = numero;
        repeticion = 1;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getRepeticion() {
        return repeticion;
    }

    public void setRepeticion(int repeticion) {
        this.repeticion = repeticion;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + this.numero;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CartaRepetida other = (CartaRepetida) obj;
        if (this.numero != other.numero) {
            return false;
        }
        other.repeticion++;
        return true;
    }

    @Override
    public String toString() {
        return "CartaRepetida{" + "numero=" + numero + ", repeticion=" + repeticion + '}';
    }
    
}
