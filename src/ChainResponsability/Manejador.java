/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChainResponsability;

/**
 *
 * @author Frank
 */
public abstract class Manejador {

    protected Manejador siguienteManejador;

    // ----------------------------------------
    public Manejador getSiguiente() {
        return this.siguienteManejador;
    }

    // ----------------------------------------
    public void setSiguiente(Manejador m) {
        this.siguienteManejador = m;
    }

    // ----------------------------------------
    public void procesar(int numero) {
        if (numero >= -100 && numero <= 100) {
            this.comprobar(numero);
        }
        if (this.getSiguiente() != null) {
            this.getSiguiente().procesar(numero);
        }
    }

    // ----------------------------------------
    public abstract void comprobar(int numero);
}
