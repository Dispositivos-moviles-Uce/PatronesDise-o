/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Memento;

/**
 *
 * @author Frank
 */
public class Memento {

    private int estado;

    // ------------------------------
    public Memento(int estado) {
        this.estado = estado;
    }

    // ------------------------------
    public void setMarcadorPagina(int estado) {
        this.estado = estado;
    }

    // ------------------------------
    public int getMarcadorPagina() {
        return this.estado;
    }
}
