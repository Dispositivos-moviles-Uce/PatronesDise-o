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
public class EstadoVerde extends EstadoSemaforo {

    public EstadoVerde() {
    }
    // -------------------------------------------

    @Override
    public void mostrar() {
        System.out.println("Luz verde");
    }

}
