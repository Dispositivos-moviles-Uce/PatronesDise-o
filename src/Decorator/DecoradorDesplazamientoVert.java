//Decorador concreto
package Decorator;

/**
 *
 * @author Frank
 */
public class DecoradorDesplazamientoVert extends DecoradorDesplazamiento {

    public DecoradorDesplazamientoVert(IVentana v) {
        super(v);
    }

    @Override
    public void dibujar(int columna, int fila) {
        // Dibujar la ventana
        this.getVentana().dibujar(columna, fila);
        // Agregar barra de desplazamiento
        this.dibujarBarraDespVertical();
    }

    private void dibujarBarraDespVertical() {
        System.out.println("Agregada barra de desplazamiento vertical");
    }
}
