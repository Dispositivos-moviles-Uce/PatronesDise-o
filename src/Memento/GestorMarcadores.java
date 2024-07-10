package Memento;

import java.util.ArrayList;

/**
 *
 * @author Frank
 */
public class GestorMarcadores {

    private ArrayList<Memento> marcadores = new ArrayList<Memento>();
    // ------------------------------

    public void addPosicionMarcador(Memento m) {
        marcadores.add(m);
    }
    // ------------------------------

    public Memento getPosicionMarcador(int indice) {
        return marcadores.get(indice);
    }
}
