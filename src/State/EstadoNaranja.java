/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package State;

/**
 *
 * @author Frank
 */
public class EstadoNaranja extends EstadoSemaforo {

    public EstadoNaranja() {
    }

   
    // -------------------------------------------

    @Override
    public void mostrar() {
        System.out.println("Luz naranja");
    }

}
